
package controllers;

import java.io.IOException;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class control {
    @FXML
    private RadioButton radioa;

    @FXML
    private RadioButton radioc;

    @FXML
    private RadioButton radioo;

       
    @FXML
    public void as() throws IOException{
     Parent root = FXMLLoader.load(getClass().getResource("/login1/polnan.fxml")); 
        Scene scene = new Scene(root);
         Stage primarystage= new Stage();
        primarystage.setScene(scene);
        primarystage.show();
    }
    @FXML
    public void zx() throws IOException{
    Parent root = FXMLLoader.load(getClass().getResource("/login1/SYM.fxml")); 
        Scene scene = new Scene(root);
         Stage primarystage= new Stage();
        primarystage.setScene(scene);
        primarystage.show();}
    @FXML
    public void qw() throws IOException{
    Parent root = FXMLLoader.load(getClass().getResource("/login1/audi.fxml")); 
        Scene scene = new Scene(root);
         Stage primarystage= new Stage();
        primarystage.setScene(scene);
        primarystage.show();
    }
    @FXML
    public void cv() throws IOException{
    Parent root = FXMLLoader.load(getClass().getResource("/login1/toyota.fxml")); 
        Scene scene = new Scene(root);
         Stage primarystage= new Stage();
        primarystage.setScene(scene);
        primarystage.show();
    }
    @FXML
    public void bn() throws IOException{
    Parent root = FXMLLoader.load(getClass().getResource("/login1/mercedes.fxml")); 
        Scene scene = new Scene(root);
         Stage primarystage= new Stage();
        primarystage.setScene(scene);
        primarystage.show();
    }
    @FXML
    public void er() throws IOException{
    Parent root = FXMLLoader.load(getClass().getResource("/login1/bmw.fxml")); 
        Scene scene = new Scene(root);
         Stage primarystage= new Stage();
        primarystage.setScene(scene);
        primarystage.show();
    }
    @FXML
    public void op() throws IOException{
    Parent root= FXMLLoader.load(getClass().getResource("/login1/JMC.fxml")); 
        Scene scene = new Scene(root);
         Stage primarystage= new Stage();
        primarystage.setScene(scene);
        primarystage.show();
    }
    @FXML
    public void gh() throws IOException{
    Parent root = FXMLLoader.load(getClass().getResource("/login1/Dayun.fxml")); 
        Scene scene = new Scene(root);
         Stage primarystage= new Stage();
        primarystage.setScene(scene);
        primarystage.show();
    }
    @FXML
    public void jk() throws IOException{
    Parent root = FXMLLoader.load(getClass().getResource("/login1/jeeb.fxml")); 
        Scene scene = new Scene(root);
         Stage primarystage= new Stage();
        primarystage.setScene(scene);
        primarystage.show();
    }
     
//     public void owner() throws IOException{
//     if(own.isSelected()){
//     AnchorPane mainpane = FXMLLoader.load(getClass().getResource("/app/view.fxml")); 
//        Scene scene = new Scene(mainpane);
//         Stage primarystage= new Stage();
//        primarystage.setScene(scene);
//        primarystage.show();
//     }
//     }
//     public void admin() throws IOException{
//     if(adm.isSelected()){
//     AnchorPane mainpane = FXMLLoader.load(getClass().getResource("/app/view.fxml")); 
//        Scene scene = new Scene(mainpane);
//         Stage primarystage= new Stage();
//        primarystage.setScene(scene);
//        primarystage.show();
//     }
//     }
 //    public void customer() throws IOException{
 //    if(cust.isSelected()){
//     AnchorPane mainpane = FXMLLoader.load(getClass().getResource("/app/FXMLDocument.fxml")); 
//        Scene scene = new Scene(mainpane);
//         Stage primarystage= new Stage();
//        primarystage.setScene(scene);
//        primarystage.show();
//     }
//     }
//    
   public void enter(Event e) {
        ((Button) e.getSource()).setScaleX(1.1);
        ((Button) e.getSource()).setScaleY(1.1);

   }
    
       public void exit(Event e) {
        ((Button) e.getSource()).setScaleX(1);
        ((Button) e.getSource()).setScaleY(1);

    }
    
//     public void log() throws IOException{
//     if(own.isSelected()){
//     BorderPane mainpane = FXMLLoader.load(getClass().getResource("/app/view.fxml")); 
//        Scene scene = new Scene(mainpane);
//         Stage primarystage= new Stage();
//        primarystage.setScene(scene);
//        primarystage.show();
//     }
//        if(adm.isSelected()){
//     BorderPane mainpane = FXMLLoader.load(getClass().getResource("/app/view.fxml")); 
//        Scene scene = new Scene(mainpane);
//         Stage primarystage= new Stage();
//        primarystage.setScene(scene);
//        primarystage.show();
//     }  if(cust.isSelected()){
//     BorderPane mainpane = FXMLLoader.load(getClass().getResource("/app/FXMLDocument.fxml")); 
//        Scene scene = new Scene(mainpane);
//         Stage primarystage= new Stage();
//        primarystage.setScene(scene);
//        primarystage.show();
//     }
  //   }
}
