/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author mauriciobedoya
 */
public class HelloAppPaneController implements Initializable {

    @FXML
    private AnchorPane AnchorPane;
    @FXML
    private Button clickMeBtn_Id;
    @FXML
    private Label label_id;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void changeLabel(ActionEvent event) {
        label_id.setText("Hello World");
    }
    
}
