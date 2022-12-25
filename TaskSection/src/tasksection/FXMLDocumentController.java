/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasksection;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author DINA
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    TextField t1;
    
    @FXML
    TextField t2;
    
    @FXML
    TextField t3;
    
    @FXML
    TextField t4;
    
    @FXML
    Label l1;
    
    @FXML
    public void handleButtonAction(ActionEvent event) {
        System.out.println(" rawan");
       l1.setText("FirstName "+t1.getText()+" LastName "+t2.getText()+" Age "+t3.getText()+" Address "+t4.getText());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
