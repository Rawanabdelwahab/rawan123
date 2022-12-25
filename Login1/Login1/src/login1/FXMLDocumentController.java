/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login1;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author moham
 */
public class FXMLDocumentController implements Initializable {

   @FXML
    private RadioButton radioa;

    @FXML
    private RadioButton radioc;

    @FXML
    private RadioButton radioo;


    @FXML
    private Button btn_login;

    @FXML
    private TextField email_up;

    @FXML
    private AnchorPane pane_login;

    @FXML
    private AnchorPane pane_signup;

    @FXML
    private PasswordField txt_password;

    @FXML
    private TextField txt_password_up;

    @FXML
    private TextField txt_username;

    @FXML
    private TextField txt_phone_up;

    @FXML
    private TextField txt_username_up;

    @FXML
    private ComboBox type;

    @FXML
    private ComboBox type_up;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public void LoginpaneShow() {
        pane_login.setVisible(true);
        pane_signup.setVisible(false);
    }

    public void SignuppaneShow() {
        pane_login.setVisible(false);
        pane_signup.setVisible(true);
    }

    /////////////////
    @FXML
    private void Login(ActionEvent event) throws Exception {
        conn = mysqlconnect.ConnectDb();
        String sql = "SELECT * FROM users where username=? and password=? and type=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_username.getText());
            pst.setString(2, txt_password.getText());
            pst.setString(3, type.getValue().toString());
            rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Username And Password is correct");

                btn_login.getScene().getWindow().hide();
                if (radioo.isSelected()) {
                    Parent root = FXMLLoader.load(getClass().getResource("view.fxml"));
                    Scene scene = new Scene(root);
                    Stage primarystage = new Stage();
                    primarystage.setScene(scene);
                    primarystage.show();
                }
                if (radioa.isSelected()) {
                   Parent root = FXMLLoader.load(getClass().getResource("view.fxml"));
                    Scene scene = new Scene(root);
                    Stage primarystage = new Stage();
                    primarystage.setScene(scene);
                    primarystage.show();
                }
                if (radioc.isSelected()) {
                     Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
                    Scene scene = new Scene(root);
                    Stage primarystage = new Stage();
                    primarystage.setScene(scene);
                    primarystage.show();
                }

            } else {
                JOptionPane.showMessageDialog(null, " Invalid Username or Password  ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    ///////////////////
    public void add_users(ActionEvent event) {
        conn = mysqlconnect.ConnectDb();
        String sql = "insert into users (username,password,email,phone,type) values(?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_username_up.getText());
            pst.setString(2, txt_password_up.getText());
            pst.setString(3, email_up.getText());
            pst.setString(4, txt_phone_up.getText());
            pst.setString(5, type_up.getValue().toString());

            pst.execute();
            JOptionPane.showMessageDialog(null, "saved");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        type_up.getItems().addAll("owner", "customer", "admin");
        type.getItems().addAll("owner", "customer", "admin");
    }

}
