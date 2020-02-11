/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 */
public class Controller {

   @FXML 
    private TextField textField;
     
    @FXML
    void openNewStage(ActionEvent event) {
           try
           {
              FXMLLoader loader = new FXMLLoader(getClass().getResource("rekentrainermenu.fxml"));
              Parent root = (Parent) loader.load();
              SecondController secController = loader.getController();
              secController.myFunction(textField.getText());
              Stage stage = new Stage();
              stage.setScene(new Scene(root));
              stage.show();
              ((Node)(event.getSource())).getScene().getWindow().hide();
           }
           catch (IOException e){
              System.out.println(e.getMessage());
           }
    }
}
