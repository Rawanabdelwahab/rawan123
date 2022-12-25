
package controllers;

import app.FXMLDocumentController;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


public class control {
   
    @FXML
    private TextField txturname;
    @FXML
    private PasswordField txtpass;
    @FXML
    private ToggleGroup ch;
    @FXML
    private Button btnok;
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    @FXML
    void login(ActionEvent event) {
        String uname= txturname.getText();
        String pass= txtpass.getText();
        if(uname.equals("") && pass.equals("")){
                    JOptionPane.showMessageDialog(null, "Username or Password Blank");

        }
        else{
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/login_test_db", "root","");
                pst = con.prepareStatement("select * from users where username=? and password=?");
                pst.setString(1, uname);
                pst.setString(2, pass);
                rs = pst.executeQuery();
                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "Login Success");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Login Faild");
                    txturname.setText("");
                    txtpass.setText("");
                    txturname.requestFocus();
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

   
    public void as() throws IOException{
     AnchorPane mainpane = FXMLLoader.load(getClass().getResource("/app/polnan.fxml")); 
        Scene scene = new Scene(mainpane);
         Stage primarystage= new Stage();
        primarystage.setScene(scene);
        primarystage.show();
    }
    public void zx() throws IOException{
    AnchorPane mainpane = FXMLLoader.load(getClass().getResource("/app/SYM.fxml")); 
        Scene scene = new Scene(mainpane);
         Stage primarystage= new Stage();
        primarystage.setScene(scene);
        primarystage.show();}
    public void qw() throws IOException{
    AnchorPane mainpane = FXMLLoader.load(getClass().getResource("/app/audi.fxml")); 
        Scene scene = new Scene(mainpane);
         Stage primarystage= new Stage();
        primarystage.setScene(scene);
        primarystage.show();
    }
    public void cv() throws IOException{
    AnchorPane mainpane = FXMLLoader.load(getClass().getResource("/app/toyota.fxml")); 
        Scene scene = new Scene(mainpane);
         Stage primarystage= new Stage();
        primarystage.setScene(scene);
        primarystage.show();
    }
    public void bn() throws IOException{
    AnchorPane mainpane = FXMLLoader.load(getClass().getResource("/app/mercedes.fxml")); 
        Scene scene = new Scene(mainpane);
         Stage primarystage= new Stage();
        primarystage.setScene(scene);
        primarystage.show();
    }
    public void er() throws IOException{
    AnchorPane mainpane = FXMLLoader.load(getClass().getResource("/app/bmw.fxml")); 
        Scene scene = new Scene(mainpane);
         Stage primarystage= new Stage();
        primarystage.setScene(scene);
        primarystage.show();
    }
    public void op() throws IOException{
    AnchorPane mainpane = FXMLLoader.load(getClass().getResource("/app/JMC.fxml")); 
        Scene scene = new Scene(mainpane);
         Stage primarystage= new Stage();
        primarystage.setScene(scene);
        primarystage.show();
    }
    public void gh() throws IOException{
    AnchorPane mainpane = FXMLLoader.load(getClass().getResource("/app/Dayun.fxml")); 
        Scene scene = new Scene(mainpane);
         Stage primarystage= new Stage();
        primarystage.setScene(scene);
        primarystage.show();
    }
    public void jk() throws IOException{
    AnchorPane mainpane = FXMLLoader.load(getClass().getResource("/app/jeeb.fxml")); 
        Scene scene = new Scene(mainpane);
         Stage primarystage= new Stage();
        primarystage.setScene(scene);
        primarystage.show();
    }

  
   
}
