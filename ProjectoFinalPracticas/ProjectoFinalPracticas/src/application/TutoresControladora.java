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

public class TutoresControladora {

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
	   private TextField NombreTexto2;
	   
	   @FXML
	   private TextField ApellidosTexto2;
	   
	   @FXML
	   private TextField EmailTexto2;
	   
	   @FXML
	   private TextField TelefonoTexto2;
	   
	   
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
		   data = conexionBBDD.ConsultaTutores();
		   Tabla.setItems(data);
		   
		   Nombre.setCellValueFactory(new PropertyValueFactory<Alumnos,String>("Nombre"));
		   Apellidos.setCellValueFactory(new PropertyValueFactory<Alumnos,String>("Apellidos"));
		}
	   
}



