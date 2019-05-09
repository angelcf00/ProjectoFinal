package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controladora {

   @FXML
   private Button myButton;

   @FXML
   private TextArea CampoGrande;

   @FXML
   public void initialize() {

       // TODO (don't really need to do anything here).

   }

   // When user click on myButton
   // this method will be called.
   public void accion(ActionEvent event) {
       System.out.println("Button Clicked!");
       
       TextConection conexionBBDD = new TextConection();
       
   }

}