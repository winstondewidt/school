/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicLong;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
   
/**
 *
 * @author Winston
 */
public class Controller3 implements Initializable{
    @FXML
    private TextField textfield1;
    @FXML
    private TextField textfield2;
    
    // alle counters
    int counter = -1;
    int foutenantwoorden = -1;
    int goedeantwoorden = 0;
 
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    @FXML TextField textfield4;
    // naar het resultaten scherm. Wanneer de counter gelijk is aan het ingevulde getal.
 public void changescreenbuttonpressedresultaat(ActionEvent event) throws IOException
{    
    textfield4.setText(String.valueOf(counter));
    if (textfield1.getText().equalsIgnoreCase(textfield4.getText()))
    {  
       try
           {
              FXMLLoader loader = new FXMLLoader(getClass().getResource("resultaat.fxml"));
              Parent root = (Parent) loader.load();
              Controller4 secController = loader.getController();
              secController.myFunction1(goed.getText());
              secController.myFunction2(fout.getText());
              secController.myFunction3(textfield4.getText());
              Stage stage = new Stage();
              stage.setScene(new Scene(root));
              stage.show();
              ((Node)(event.getSource())).getScene().getWindow().hide();
           }
           catch (IOException e){
              System.out.println(e.getMessage());
           }
   }
   else
   {
     Autosom();
   }   
}
 // het maken van de som
int myLow = 1;
int myHigh = 10; 
public int randBetween(int low, int high){
    return (int) Math.round(Math.random() * (high - low)) + low;
}
//groep 7/8 sommen
public String makeProblem(AtomicLong answer){
    
    int a = randBetween(myLow, myHigh);
    int b = randBetween(myLow, myHigh);
    double result;
    char operator;
     if ("JA".equals(textfield7.getText()))
     {
    switch(randBetween(1,4)){
        case 1: 
            operator = '+';
            result = a + b;
            break;
        case 2: 
            operator = '-';
            result = a - b;
            break;
        case 3: 
            operator = 'x';
            result = a * b;
            break;
        case 4: 
            operator = ':';
            result = (double) a / b;
            break;
        default:
            operator = '\1';
            result = Double.NaN;
    }
    answer.set(Double.doubleToLongBits(result));
    return String.format("%d %c %d = ",a,operator,b);
     }
     else
     {
          switch(randBetween(1,4)){
        case 3: 
            operator = 'x';
            result = a * b;
            break;
        default:
            operator = '\1';
            result = Double.NaN;
     }
     answer.set(Double.doubleToLongBits(result));
    return String.format("%d %c %d = ",a,operator,b);
    }
}
// groep 3/4
public String makeProblem2(AtomicLong answer){
    
    int a = randBetween(myLow, myHigh);
    int b = randBetween(myLow, myHigh);
    double result;
    char operator;
     if ("JA".equals(textfield7.getText()))
    {
    switch(randBetween(1,2)){
        case 1: 
            operator = '+';
            result = a + b;
            break;
        case 2: 
            operator = '-';
            result = a - b;
            break;
        default:
            operator = '\1';
            result = Double.NaN;
    }
     answer.set(Double.doubleToLongBits(result));
    return String.format("%d %c %d = ",a,operator,b);
    }
     else
     {
          switch(randBetween(1,2)){
        case 1: 
            operator = '+';
            result = a + b;
            break;
        default:
            operator = '\1';
            result = Double.NaN;
     }
    answer.set(Double.doubleToLongBits(result));
    return String.format("%d %c %d = ",a,operator,b);
}
}
// groep 5/6
public String makeProblem3(AtomicLong answer){
    
    int a = randBetween(myLow, myHigh);
    int b = randBetween(myLow, myHigh);
    double result;
    char operator;
    if ("JA".equals(textfield7.getText()))
    {
    switch(randBetween(1,3)){
        case 1: 
            operator = '+';
            result = a + b;
            break;
        case 2: 
            operator = '-';
            result = a - b;
            break;
        case 3: 
            operator = 'x';
            result = a * b;
            break;
        case 4: 
            operator = ':';
            result = (double) a / b;
            break;
        default:
            operator = '\1';
            result = Double.NaN;
    }
    answer.set(Double.doubleToLongBits(result));
    return String.format("%d %c %d = ",a,operator,b);
    }
    else
    {
       switch(randBetween(1,2)){
        case 1: 
            operator = '+';
            result = a + b;
            break;
        default:
        operator = '\1';
        result = Double.NaN;
    }
    answer.set(Double.doubleToLongBits(result));
    return String.format("%d %c %d = ",a,operator,b);
}
}

@FXML Label aantal;
@FXML Label persoon;
// De counters komen hier samen en vullen alles in. Dus wanneer je vraag 1 maak en goed heb, worden de counters natuurlijk 1. Ook heb ik een gesprekje bij gevoegd!
public void Aantalsommen() 
{
    counter++;
    System.out.println(counter);
    String Getal = "Aantal sommen gemaakt: " + String.valueOf(counter);
    aantal.setText(Getal);
     if (textfield3.getText().equals(Ingevuldegetal.getText()) )
     {
     goedeantwoorden++;
     goed.setText("Aantal sommen goed: " + String.valueOf(goedeantwoorden));
     persoon.setText("Brain zegt: Goed gedaan zeg, ga zo door!");
     }
     else
     {
     foutenantwoorden++;
     fout.setText("Aantal sommen fout: " + String.valueOf(foutenantwoorden));
     persoon.setText("Brain zegt: Geef niks, probeer het opnieuw!");
     }
   
}
@FXML private Label goed;
@FXML private Label fout;
@FXML private TextField Ingevuldegetal;
@FXML private TextField textfield3;
@FXML private Label labelgetal1;
@FXML private TextField textfield6;
@FXML private TextField textfield7;

// Hier maakt de "autosom" de gehele som en vult hij alles in. Ook word het  antwoord uitgeprint, zodat je altijd kan controleren of het antwoord wel goed is.
// Dit is voor groep 3 top en mnet 8
public void Autosom() throws IOException{
    Aantalsommen();
    AtomicLong outVariable = new AtomicLong();
    if ("Groep3/4".equals(textfield6.getText()))
    {
    String question = makeProblem2(outVariable);
    labelgetal1.setText("" + question);
    System.out.println(question);
    
    double answer = Double.doubleToLongBits(outVariable.get());
    String Controleer = Double.toString(answer);
    textfield3.setText(Controleer);
    System.out.println(Controleer);
    }
    if ("Groep5/6".equals(textfield6.getText()))
    {
     String question = makeProblem3(outVariable);
    labelgetal1.setText("" + question);
    System.out.println(question);
    
    double answer = Double.longBitsToDouble(outVariable.get());
    String Controleer = Double.toString(answer);
    textfield3.setText(Controleer);
    System.out.println(Controleer);
    }
    if ("Groep7/8".equals(textfield6.getText()))
    {
    String question = makeProblem(outVariable);
    labelgetal1.setText("" + question);
    System.out.println(question);
    
    double answer = Double.longBitsToDouble(outVariable.get());
    String Controleer = Double.toString(answer);
    textfield3.setText(Controleer);
    System.out.println(Controleer);
    }
}
// hier worden alle textfielden gevuld
   public void myFunction2(String text)
   {
     textfield1.setText(text);
   }
   public void myFunction3(String text)
   {
    textfield2.setText(text);
   }
   public void myFunction4(String text)
   {
    textfield6.setText(text);
   }
   public void myFunction5(String text)
   {
    textfield7.setText(text);
   }
  
}
    
           
           
