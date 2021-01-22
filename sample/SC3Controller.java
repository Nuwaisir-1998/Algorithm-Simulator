package sample;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.util.*;
import java.io.*;
import javafx.scene.text.FontPosture;

import javafx.scene.text.FontWeight;


public class SC3Controller implements Initializable {
    
     @FXML
    public TextField tf;
    @FXML
    private Label label;
    @FXML
    public Circle c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17;
    @FXML
    public Text t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16;
     @FXML
     public Circle[] cr=new Circle[17];
     @FXML
     public TextArea  ta;
     @FXML
     public void raw(){System.out.print("fff");}
     @FXML
     public void sta(){
         int y=(int)(Double.parseDouble(tf.getText()));
         cr[0]=c1;
         cr[1]=c2;
         cr[2]=c3;
         cr[3]=c4;
         cr[4]=c5;
         cr[5]=c6;
         cr[6]=c7;
         cr[7]=c8;
         cr[8]=c9;
         cr[9]=c10;
         cr[10]=c11;
         cr[11]=c12;
         cr[12]=c13;
         cr[13]=c14;
         cr[14]=c15;
         cr[15]=c16;
         cr[16]=c17;
         Tre tr=new Tre(cr,y,tf,ta);
         tr.start();
     }

    private Main main;
    void setMain(Main main) {
        this.main = main;
    }
    @FXML
       
//    private void handleButtonAction(ActionEvent event) throws IOException {
//        //System.out.println("lllllllll");
//        Parent hp=FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
//        Scene hs=new Scene(hp);
//        Stage ap=(Stage)((Node) event.getSource()).getScene().getWindow();
//        ap.setScene(hs);
//        ap.show();
//    }

    void goBack()
    {
        try {
            main.showMainMenu();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void ha1(ActionEvent event) throws IOException {
        try{
        BufferedReader br=new BufferedReader(new FileReader("src\\sample\\dfs.txt"));
        String line=null;
        String li="";
        int num=0;
        while((line=br.readLine())!=null){num++;li+="\n"+line;}
        Text tx=new Text(li);
        tx.setLayoutX(50);
        tx.setLayoutY(135);
        Text txh=new Text("Depth First Search(DFS)");
        txh.setLayoutX(190);
        txh.setLayoutY(80);
        txh.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 40));
       // Font font=new Font();
       txh.setFill(Color.DARKBLUE);
        tx.setFont(Font.font("Arial", FontWeight.NORMAL, FontPosture.REGULAR, 20));
        Stage st=new Stage();
        Pane rot=new Pane();
        rot.getChildren().addAll(tx,txh);
        Scene sc=new Scene(rot,1050,600);
        st.setScene(sc);
        st.setTitle("Depth First Search");
        st.show();}catch(Exception e){e.printStackTrace();}
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
