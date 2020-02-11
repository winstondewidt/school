/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.IOException;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Winston
 */

public class Controller4 {
    @FXML Label label1;
    @FXML Label label2;
    @FXML Label label3;
   public void myFunction1(String text)
   {
     label1.setText(text);
   }
   public void myFunction2(String text)
   {
    label2.setText(text);
   }
   public void myFunction3(String text)
   {
       label3.setText(text);
   }
   public void StopHandler(ActionEvent event) throws IOException
   {
    Platform.exit();
    System.exit(0);   
   }
   
    public void openNewStage2(ActionEvent event) {
           try
           {
              FXMLLoader loader = new FXMLLoader(getClass().getResource("rekentrainermain.fxml"));
              Parent root = (Parent) loader.load();
              Stage stage2 = new Stage();
              stage2.setScene(new Scene(root));
              stage2.show();
              ((Node)(event.getSource())).getScene().getWindow().hide();
           }
           catch (IOException e){
              System.out.println(e.getMessage());
           }
    }
}
