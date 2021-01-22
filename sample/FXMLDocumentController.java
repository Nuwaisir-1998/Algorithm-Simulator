package sample;

import com.sun.corba.se.impl.orb.ParserTable;
import static java.lang.Thread.sleep;
//import java.awt.Rectangle;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.util.Duration;
import javafx.geometry.Rectangle2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Translate;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXMLLoader;

public class FXMLDocumentController implements Initializable {


    private Main main;
    void setMain(Main main) {
        this.main = main;
    }

    @FXML
    Button back;
    @FXML
    public Rectangle r1,r2,r3;
    @FXML
    public Label l1,l2,l3,l4,l5,l6,l7,l8;
    @FXML
    public Text x1,x2,x3,x4,x5,x6,x7,x8;
    @FXML

    public Text tr[]=new Text[8];
    @FXML
    public TextField t1,t2,t3,t4,t5,t6,t7,t8;
    @FXML
    public Timeline[] tt2=new Timeline[8];

    @FXML
    void goBack()
    {
        try {
            main.Sortings();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public int p=0;
    public int q=0,count=0;
    //public Threadi thr;
    public static int but=-1;
    public int con=90;
           int posi[]={200,260,320,380,440,500,560,620};
    @FXML
    public void handleButtonAction() {
        ++but;
        if(but==0)
        {
            x1.setText(t1.getText());
            x2.setText(t2.getText());
            x3.setText(t3.getText());
            x4.setText(t4.getText());
            x5.setText(t5.getText());
            x6.setText(t6.getText());
            x7.setText(t7.getText());
            x8.setText(t8.getText());
                        
        //thr=new Threadi();
        tr[0]=x1;
        tr[1]=x2;
        tr[2]=x3;
        tr[3]=x4;
        tr[4]=x5;
        tr[5]=x6;
        tr[6]=x7;
        tr[7]=x8;
        }
        
        if(but==0){con-=27;down(tr,1,8);}
        if(but==1){con-=27;down(tr,1,4);}
        if(but==2)down(tr,5,8);
        if(but==3){con-=27;down(tr,1,2);}
        if(but==4)down(tr,3,4);
        if(but==5)down(tr,5,6);
        if(but==6)down(tr,7,8);
        if(but==7)up(tr,1,2);
        if(but==8)up(tr,3,4);
        if(but==9)up(tr,5,6);
        if(but==10)up(tr,7,8);
        if(but==11)upp();
        //if(but==0){System.out.println("mmmm");upp(tr,1,4,1);}
       // if(but==7)down(tr,5,8);
        
    }
    public void upp()
    {//a-1 theke cal
        Thre th1=new Thre(tr);
        /*int r=b-a+1,p=0,q=0,k=0;*/
       
        th1.start();
         
    }
    public void ani(Rectangle R1)
    {
       
    }
    public void up(Text[] tr,int a,int b)
    {
        int pos=0;
        double d1;
        d1 = Double.parseDouble(tr[a-1].getText());
        double d2=Double.parseDouble(tr[b-1].getText());//ParseDouble(tr[b].getText());
        if(d1>d2)pos+=38;
        Timeline tm;
        
        tm=new Timeline();
        KeyFrame k1=new KeyFrame(Duration.seconds(.5),
        new KeyValue(tr[a-1].layoutXProperty(),tr[a-1].getLayoutX()+con+pos),
                new KeyValue(tr[a-1].layoutYProperty(),tr[a-1].getLayoutY()-60)
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        
        Timeline tm2=new Timeline();
        KeyFrame k2=new KeyFrame(Duration.seconds(.5),
        new KeyValue(tr[b-1].layoutXProperty(),tr[b-1].getLayoutX()-con-pos),
                new KeyValue(tr[b-1].layoutYProperty(),tr[b-1].getLayoutY()-60)
        );
        tm2.getKeyFrames().addAll(k2);
        tm2.play();
        tm.setOnFinished(event -> {
            if(d1>d2){
           Text temp=new Text();
           temp=tr[a-1];
           tr[a-1]=tr[b-1];
           tr[b-1]=temp;
            }});
        
    }

    public void down(Text[] tr,int p,int q)
    {
        int j;
        int k=q-p+1;
        k/=2;
        int m=0;
        //k+=(p-1);
        //System.out.println(tr[0].getLayoutX());
        Timeline tm=new Timeline();
        //DoubleProperty hh=20;
        for(j=p-1;m<k;j++,m++){
        tm=new Timeline();
        KeyFrame k1=new KeyFrame(Duration.seconds(.5),
        new KeyValue(tr[j].layoutXProperty(),tr[j].getLayoutX()-con),
                new KeyValue(tr[j].layoutYProperty(),tr[j].getLayoutY()+60)
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        tm.setOnFinished(event -> {             
            });
        }
        for(j=q-1;m>0;j--,m--){
         tm=new Timeline();
        KeyFrame k1=new KeyFrame(Duration.seconds(.5),
        new KeyValue(tr[j].layoutXProperty(),tr[j].getLayoutX()+con),
                new KeyValue(tr[j].layoutYProperty(),tr[j].getLayoutY()+60)
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        }
        //try{Thread.sleep(500);}catch(Exception e){e.printStackTrace();}
        
        //if(p==q/2)return;
        //down(tr,p,q/2);
        //down(tr,q/2+1,q);
        //System.out.println(tr[1].getLayoutX());
       // run(tr,i,r);
        //run(tr,r+1,r*2);
    
        /*Timeline t3=new Timeline();
        Timeline t4=new Timeline();
        Timeline t5=n111ew Timeline();
        Timeline t6=new Timeline();*/
        //down(i);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private double ParseDouble(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
