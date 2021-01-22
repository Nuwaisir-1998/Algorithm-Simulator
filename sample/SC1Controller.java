package sample;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Lenovo
 */
public class SC1Controller implements Initializable {
    
    
    @FXML
    private Label label;
    @FXML
    private int ar[];
    
  
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        
        Parent hp=FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene hs=new Scene(hp);
        Stage ap=(Stage)((Node) event.getSource()).getScene().getWindow();
        ap.setScene(hs);
        ap.show();
    }
    @FXML
    private void ha1(ActionEvent event) throws IOException {
        ar=new int[5];
        Rectangle[] r=new Rectangle[5];
        final Duration SS=Duration.millis(2000);
        Stage st=new Stage();
        
        r[0]=new Rectangle();
        r[0].setY(100);
        r[0].setX(50);
        r[0].setHeight(20);
        r[0].setWidth(15);
        r[0].setFill(Color.BLUE);
        r[1]=new Rectangle();
        r[1].setY(80);
        r[1].setX(70);
        r[1].setHeight(40);
        r[1].setWidth(15);
        r[1].setFill(Color.BLUE);
        ar[1]=40;
        r[2]=new Rectangle();
        r[2].setY(110);
        r[2].setX(90);
        r[2].setHeight(10);
        r[2].setWidth(15);
        r[2].setFill(Color.BLUE);
        ar[2]=10;
        r[3]=new Rectangle();
        r[3].setY(60);
        r[3].setX(110);
        r[3].setHeight(60);
        r[3].setWidth(15);
        r[3].setFill(Color.BLUE);
        ar[3]=60;
        r[4]=new Rectangle();
        r[4].setY(65);
        r[4].setX(130);
        r[4].setHeight(55);
        r[4].setWidth(15);
        r[4].setFill(Color.BLUE);
        ar[4]=55;
        
        for(int i=0;i<1;i++){
            for(int j=0;j<4;j++)
            {
                if(r[j].getHeight()<r[j+1].getHeight())
                {
                    //r[j].setFill(Color.RED);
                    TranslateTransition tt=new TranslateTransition(SS);
        tt.setNode(r[j]);
        tt.setToX(20);
        tt.play();
        //tt.stop();
        TranslateTransition t2=new TranslateTransition(SS);
        t2.setNode(r[j+1]);
        t2.setToX(-20);
        t2.play();
        //r[j].setX(r[j+1].getX());   
                }
            }
            /*for(int j=0;j<4;j++)
            {
                if(r[j].getHeight()<r[j+1].getHeight()){
                     double tem= r[j].getHeight();
                     r[j].setHeight(r[j+1].getHeight());
                     r[j+1].setHeight(tem);
                     double te=r[j].getY();
                     r[j].setY(r[j+1].getY());
                     r[j+1].setY(te);
                }
            }*/
        }
       
        Pane rot=new Pane();
        rot.getChildren().addAll(r[0],r[1],r[2],r[3],r[4]);
        Scene sc=new Scene(rot,700,700);
        st.setScene(sc);
        st.show();
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
