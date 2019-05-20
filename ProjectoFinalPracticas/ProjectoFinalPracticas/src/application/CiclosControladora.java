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

public class CiclosControladora {

	TextConection conexionBBDD = new TextConection();
	   @FXML
	   private Button Anadir;
	   @FXML
	   private Button Borrar;

	   @FXML
	   private TextField ClaveTexto;

	   @FXML
	   private TextField NombreTexto;
	   
	   @FXML
	   private TextField ClaveFPTexto;
	   
	   @FXML
	   private TextField TipoTexto;
	   
	   @FXML
	   private TextField ClaveFPTexto2;
	   
	   @FXML
	   private TextField AngelTexto2;
	   
	   @FXML
	   private TableView<Alumnos> Tabla;
	   
	   @FXML
	   private TableColumn<Alumnos, String> Clave ;
	   
	   @FXML
	   private TableColumn<Alumnos, String> Nombre ;
	   
	   public void Anadir(ActionEvent event) throws SQLException {
		   conexionBBDD = new TextConection();
		   conexionBBDD.NuevoAlunmo(ClaveTexto.getText(), NombreTexto.getText(), ApellidosTexto.getText(), EmailTexto.getText(), TelefonoTexto.getText());
	   
	   
	   
}
		
		public ObservableList<Ciclo> data = FXCollections.observableArrayList(new Alumnos(0,""));
	   
	   
	   @FXML
		private void initialize(){
		   conexionBBDD = new TextConection();
		   data = conexionBBDD.ConsultaAlumnos();
		   Tabla.setItems(data);
		   
		   Nombre.setCellValueFactory(new PropertyValueFactory<Alumnos,String>("Nombre"));
		   Clave.setCellValueFactory(new PropertyValueFactory<Alumnos,String>("Clave"));
		}
}
