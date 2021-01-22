package sample;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Lenovo
 */
public class SC2Controller implements Initializable {
    
    @FXML
    private Label label;
  
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        //System.out.println("lllllllll");
        Parent hp=FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene hs=new Scene(hp);
        Stage ap=(Stage)((Node) event.getSource()).getScene().getWindow();
        ap.setScene(hs);
        ap.show();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
