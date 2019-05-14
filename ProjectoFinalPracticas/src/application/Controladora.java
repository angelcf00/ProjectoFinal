package application;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controladora {

	@FXML
	private Button ButtonEmpresas;
	@FXML
	private Button ButtonAlumnos;
	@FXML
	private Button ButtonTutores;
	@FXML
	private Button ButtonCiclos;
	@FXML
	private Button ButtonCentro;
	@FXML
	private Button ButtonGenerar;

	@FXML
	private Button ButtonVincular;
	
	@FXML
	private void initialize(){
	}

       // TODO (don't really need to do anything here).

   // When user click on myButton
   // this method will be called.
   public void Empresas(ActionEvent event) throws IOException {
       System.out.println("Button Clicked!");
       
       TextConection conexionBBDD = new TextConection();
       
       
       FXMLLoader loader = new FXMLLoader(Main.class.getResource("Empresas.fxml"));
       AnchorPane ventanaDos = (AnchorPane) loader.load();
       Stage ventana = new Stage();
       ventana.setTitle("Ventana añadir");
       Scene scene = new Scene(ventanaDos);
       ventana.setScene(scene);
       ventana.show();
   }

   public void Alumnos(ActionEvent event) throws IOException {
       System.out.println("Button Clicked!");
       
       TextConection conexionBBDD = new TextConection();
       
       
       FXMLLoader loader = new FXMLLoader(Main.class.getResource("Alumnos .fxml"));
       AnchorPane ventanaDos = (AnchorPane) loader.load();
       Stage ventana = new Stage();
       ventana.setTitle("Ventana añadir");
       Scene scene = new Scene(ventanaDos);
       ventana.setScene(scene);
       ventana.show();
   }
   
   public void Centro(ActionEvent event) throws IOException {
       System.out.println("Button Clicked!");
       
       TextConection conexionBBDD = new TextConection();
       
       
       FXMLLoader loader = new FXMLLoader(Main.class.getResource("Centro.fxml"));
       AnchorPane ventanaDos = (AnchorPane) loader.load();
       Stage ventana = new Stage();
       ventana.setTitle("Ventana añadir");
       Scene scene = new Scene(ventanaDos);
       ventana.setScene(scene);
       ventana.show();
   }
   
   public void Ciclos(ActionEvent event) throws IOException {
       System.out.println("Button Clicked!");
       
       TextConection conexionBBDD = new TextConection();
       
       
       FXMLLoader loader = new FXMLLoader(Main.class.getResource("Ciclos.fxml"));
       AnchorPane ventanaDos = (AnchorPane) loader.load();
       Stage ventana = new Stage();
       ventana.setTitle("Ventana añadir");
       Scene scene = new Scene(ventanaDos);
       ventana.setScene(scene);
       ventana.show();
   }
   
   public void Tutores(ActionEvent event) throws IOException {
       System.out.println("Button Clicked!");
       
       TextConection conexionBBDD = new TextConection();
       
       
       FXMLLoader loader = new FXMLLoader(Main.class.getResource("Tutores.fxml"));
       AnchorPane ventanaDos = (AnchorPane) loader.load();
       Stage ventana = new Stage();
       ventana.setTitle("Ventana añadir");
       Scene scene = new Scene(ventanaDos);
       ventana.setScene(scene);
       ventana.show();
   }
   
   public void Vincular(ActionEvent event) throws IOException {
       System.out.println("Button Clicked!");
       
       TextConection conexionBBDD = new TextConection();
       
       FXMLLoader loader = new FXMLLoader(Main.class.getResource("VincularEmpresa.fxml"));
       AnchorPane ventanaDos = (AnchorPane) loader.load();
       Stage ventana = new Stage();
       ventana.setTitle("Ventana añadir");
       Scene scene = new Scene(ventanaDos);
       ventana.setScene(scene);
       ventana.show();
   }
}