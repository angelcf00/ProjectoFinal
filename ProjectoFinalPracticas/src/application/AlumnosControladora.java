package application;


import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AlumnosControladora {

	TextConection conexionBBDD = new TextConection();
	   @FXML
	   private Button Anadir;
	   @FXML
	   private Button Borrar;

	   @FXML
	   private TextField DNITexto;

	   @FXML
	   private TextField NombreTexto;
	   
	   @FXML
	   private TextField ApellidosTexto;
	   
	   @FXML
	   private TextField EmailTexto;
	   
	   @FXML
	   private TextField TelefonoTexto;
	   
	   @FXML
	   private TextField DNITexto2;
	   
	   @FXML
	   private TextField ClaveTexto;
	   
	   @FXML
	   private TableView<Alumnos> Tabla;
	   
	   @FXML
	   private TableColumn<Alumnos, String> Nombre ;
	   
	   @FXML
	   private TableColumn<Alumnos, String> Apellidos ;
	   
	   public void Anadir(ActionEvent event) throws SQLException {
		   conexionBBDD = new TextConection();
		   conexionBBDD.NuevoAlunmo(DNITexto.getText(), NombreTexto.getText(), ApellidosTexto.getText(), EmailTexto.getText(), TelefonoTexto.getText());
	   
	   
	   
}
		
		public ObservableList<Alumnos> data = FXCollections.observableArrayList(new Alumnos("",""));
	   
	   
	   @FXML
		private void initialize(){
		   conexionBBDD = new TextConection();
		   data = conexionBBDD.ConsultaAlumnos();
		   Tabla.setItems(data);
		   
		   Nombre.setCellValueFactory(new PropertyValueFactory<Alumnos,String>("Nombre"));
		   Apellidos.setCellValueFactory(new PropertyValueFactory<Alumnos,String>("Apellidos"));
		}
	   
}
