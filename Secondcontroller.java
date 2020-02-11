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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Winston
 */
public class SecondController {
    @FXML 
    private Label label;
    @FXML
    private TextField Hoeveelheidsommen;
    @FXML
    private TextField textfield2;
    @FXML
    private TextField textfield3;
    
    public void myFunction(String text)
    {
     label.setText(text);
    }
    public void Functie3()
    {
        textfield2.setText("Groep3/4");
    }
     public void Functie4()
    {
       textfield2.setText("Groep3/4");
    }
      public void Functie5()
    {
       textfield2.setText("Groep5/6");
    }
       public void Functie6()
    {
      textfield2.setText("Groep5/6");
    }
        public void Functie7()
    {
       textfield2.setText("Groep7/8");
    }
         public void Functie8()
    {
       textfield2.setText("Groep7/8");
    }
     public void Functie9()
    {
       textfield3.setText("JA");
    }
    public void Functie10()
    {
       textfield3.setText("NEE");
    }
    
     @FXML
    void openNewStage2(ActionEvent event) {
           try
           {
              FXMLLoader loader = new FXMLLoader(getClass().getResource("rekentrainersommen.fxml"));
              Parent root = (Parent) loader.load();
              Controller3 trd = loader.getController();
              trd.myFunction2(Hoeveelheidsommen.getText());
              trd.myFunction4(textfield2.getText());
              trd.myFunction5(textfield3.getText());
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
     
   
    
    

