/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
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
public class FXMLDocumentController1 implements Initializable {
    
    @FXML
    private Label label;
  
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        //System.out.println("lllllllll");
        Parent hp=FXMLLoader.load(getClass().getResource("SC1.fxml"));
        Scene hs=new Scene(hp);
        Stage ap=(Stage)((Node) event.getSource()).getScene().getWindow();
        ap.setScene(hs);
        ap.show();
    }
    
    @FXML
    private void handleButtonAction1(ActionEvent event) throws IOException {
        //System.out.println("lllllllll");
        Parent hp=FXMLLoader.load(getClass().getResource("FXML_DocumentController_1.fxml"));
        Scene hs=new Scene(hp);
        Stage ap=(Stage)((Node) event.getSource()).getScene().getWindow();
        ap.setScene(hs);
        ap.show();
    }
    
    @FXML
    private void handleButtonAction2(ActionEvent event) throws IOException {
        //System.out.println("lllllllll");
        Parent hp=FXMLLoader.load(getClass().getResource("SC3.fxml"));
        Scene hs=new Scene(hp);
        Stage ap=(Stage)((Node) event.getSource()).getScene().getWindow();
        ap.setScene(hs);
        ap.show();
    }
    @FXML
    public void handleButtonAction3() {
        System.out.println("lllllllll");
        
    }
    @FXML
    private void exit(ActionEvent event) throws IOException {
        //System.out.println("lllllllll");
        //WindowEvent ww=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
