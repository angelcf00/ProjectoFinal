package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TextConection {
	private String bd;
	private String url= "jdbc:oracle:thin:@localhost:1521:XE";
	private String usr = "";
	private String pwd = "";
	private static Connection conexion;


	

	public TextConection()  {
		Properties propiedades = new Properties();
		InputStream entrada = null;
		try {
			File miFichero = new File("BBDD.INI");
			if(miFichero.exists()) {
				entrada = new FileInputStream(miFichero);
				propiedades.load(entrada);
			bd =	propiedades.getProperty("bd");
			url =	propiedades.getProperty("url");
			usr =	propiedades.getProperty("usr");
			pwd =	propiedades.getProperty("pwd");
			 
			System.out.println(bd);
			System.out.println(url);
			System.out.println(usr);
			System.out.println(pwd);
				
			} else
				System.err.println("Fichero no encontrado");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (entrada !=null) {
				try {
					entrada.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	

		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexion = DriverManager.getConnection(url, usr, pwd);
			         
			if(!conexion.isClosed()) {
				System.out.println("Conexión establecida");
				
			}
			else
				System.out.println("Fallo en Conexión");	
			

		}catch (Exception e) {
			System.out.println("ERROR en conexión con ORACLE");													
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		new TextConection();
																	
		conexion.close();
	}
	
	public ObservableList<Alumnos> ConsultaAlumnos(){
		ObservableList<Alumnos> aux = FXCollections.observableArrayList();
		
		try {
			Statement stmt = conexion.createStatement();
			
			String query = "SELECT NOMBRE, APELLIDOS, EMAIL, TELEFONO FROM angel.Alumnos";
			System.out.println(query);
			ResultSet rset = stmt.executeQuery(query);
			while(rset.next()) {
				String Nombre = rset.getString(1);
				String Apellidos = rset.getString(2);
				String Email = rset.getString(3);
				int Telefono = rset.getInt(4);
				
				Alumnos auxAlu = new Alumnos(Nombre, Apellidos);
				aux.add(auxAlu);
				
		}
		rset.close();
		stmt.close();
		}   catch (SQLException s) {
			s.printStackTrace();
			
		}
		return aux;
}
	
	public int NuevoAlunmo(String DNI, String nombre, String apellidos, String email, String telefono) throws SQLException {
		
		ObservableList<Alumnos> aux = FXCollections.observableArrayList();
		Statement stmt = conexion.createStatement();
		int num = stmt.executeUpdate("INSERT INTO ANGEL.ALUMNOS VALUES ("+DNI+" , '"+nombre+"' , '"+apellidos+"', '"+email+"', "+telefono+")");
		System.out.println("Alumno Editado");
		stmt.close();
		return num;
	}
}