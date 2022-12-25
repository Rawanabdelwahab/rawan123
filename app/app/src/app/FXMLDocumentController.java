/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author YN
 */
public class FXMLDocumentController implements Initializable {
    
     @FXML
    private Button btnok;

    @FXML
    private ToggleGroup ch;

    @FXML
    private PasswordField txtpass;

    @FXML
    private TextField txturname;
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

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
