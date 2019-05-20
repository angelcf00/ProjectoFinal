package application;

import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class EmpresaControladora {

	TextConection conexionBBDD = new TextConection();
	   @FXML
	   private Button Anadir;
	   @FXML
	   private Button Borrar;

	   @FXML
	   private TextField IDconvenio;

	   @FXML
	   private TextField CIF;
	   
	   @FXML
	   private TextField Representante;
	   
	   @FXML
	   private TextField NIFrep;
	   
	   @FXML
	   private TextField Nombre;
	   
	   @FXML
	   private TextField Pais;
	   
	   @FXML
	   private TextField Ciudad;
	   
	   @FXML
	   private TextField Provincia;
	   
	   @FXML
	   private TextField Direccion;
	   
	   @FXML
	   private TextField CP;
	   
	   @FXML
	   private TextField Telefono;
	   
	   @FXML
	   private TextField Fax;
	   
	   @FXML
	   private TableView<Empresas> Tabla;
	   
	   @FXML
	   private TableColumn<Empresas, Integer> IDconvenio1 ;
	   
	   @FXML
	   private TableColumn<Empresas, String> NombreEmpresa1  ;
	   
	   public void Anadir(ActionEvent event) throws SQLException {
		   conexionBBDD = new TextConection();
		   conexionBBDD.NuevoEmpresas(IDconvenio.getText(), CIF.getText(), Representante.getText(), NIFrep.getText(), Nombre.getText(),
				   Pais.getText(), Ciudad.getText(),Provincia.getText(), Direccion.getText(), CP.getText(), Telefono.getText(), Fax.getText());
	   
	   
	   
}
		
		public ObservableList<Empresas> data = FXCollections.observableArrayList(new Empresas(0,""));
	   
	   
	   @FXML
		private void initialize(){
		   conexionBBDD = new TextConection();
		   data = conexionBBDD.ConsultaEmpresas();
		   
		   System.out.println(data);
		   
		   Tabla.setItems(data);
		   
		   IDconvenio1.setCellValueFactory(new PropertyValueFactory<Empresas,Integer>("IDConvenio"));
		   NombreEmpresa1.setCellValueFactory(new PropertyValueFactory<Empresas,String>("NombreEmpresa"));
		   
		}
}
