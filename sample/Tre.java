package sample;

import javafx.animation.Animation;
import java.util.Vector;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class Tre extends Thread{

    public Circle[] cir;
    public TextField ttt;
    public String inp;
    public TextArea ta;
    public int intt=0;
    public StringBuffer oup1=new StringBuffer("");////char nibe
    public String oup2="Welcome to dfs:\n";
    public String oup3="";
    public int[] val={1,2,4,3,5,3,6,5,4,1,9,4,1,2
            ,2,5};
    public int coun=0;
    public int num;
    public Tre(Circle[] cr,int y,TextField tt,TextArea tta) {num=y;ta=tta;
        cir=new Circle[17];
        for(int i=0;i<17;i++)cir[i]=cr[i];
        ttt=tt;
         inp=new String();
        inp=ttt.getText();
        System.out.println(inp);
    }
    @Override
    public void run() {
        ta.setText(oup2);
        Timeline tm=new Timeline();
         tm=new Timeline();
        KeyFrame k1;
        
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[0].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[0].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        String s1=new String();
        s1=Integer.toString(val[0])+" ";
        oup1.append(s1);
        intt+=2;
        if(val[0]==
                (Integer.parseInt(inp))){
            oup2+=new String(oup1)+"\n";
            ta.setText(oup2);
            
            try{Thread.sleep(1300);}catch(Exception e){}
            cir[16].setFill(Color.GREENYELLOW);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.ORANGE);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.DEEPPINK);
            coun++;
        }
       try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[1].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[1].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        s1=new String();
        s1=Integer.toString(val[1])+" ";
        oup1.append(s1);
        intt+=2;
        if(val[1]==(Integer.parseInt(inp))){coun++;
            
            oup2+=new String(oup1)+"\n";
            ta.setText(oup2);
            
            try{Thread.sleep(1300);}catch(Exception e){}
            cir[16].setFill(Color.GREENYELLOW);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.ORANGE);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.DEEPPINK);
        }
        
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[2].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[2].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        s1=new String();
        s1=Integer.toString(val[2])+" ";
        oup1.append(s1);
        intt+=2;
       if(val[2]==(Integer.parseInt(inp))){
            coun++;
            
            oup2+=new String(oup1)+"\n";
            ta.setText(oup2);
            try{Thread.sleep(1300);}catch(Exception e){}
            cir[16].setFill(Color.GREENYELLOW);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.ORANGE);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.DEEPPINK);
        }
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[3].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[3].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        s1=new String();
        s1=Integer.toString(val[3])+" ";
        oup1.append(s1);
        intt+=2;
        
        if(val[3]==(Integer.parseInt(inp))){
            coun++;
            oup2+=new String(oup1)+"\n";
            ta.setText(oup2);
            
            try{Thread.sleep(1300);}catch(Exception e){}
            cir[16].setFill(Color.GREENYELLOW);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.ORANGE);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.DEEPPINK);
        }
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[2].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[2].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        ///////////////delete
        oup1.delete(intt-2, intt);
        intt-=2;
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[4].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[4].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        s1=new String();
        s1=Integer.toString(val[4])+" ";
        oup1.append(s1);
        intt+=2;
        if(val[4]==(Integer.parseInt(inp))){
            coun++;
            
            oup2+=new String(oup1)+"\n";
            ta.setText(oup2);
            try{Thread.sleep(1300);}catch(Exception e){}
            cir[16].setFill(Color.GREENYELLOW);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.ORANGE);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.DEEPPINK);
        }
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[2].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[2].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        //////////////////////////////////del
        oup1.delete(intt-2, intt);
        intt-=2;
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[1].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[1].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        /////////////////////////del
        oup1.delete(intt-2, intt);
        intt-=2;
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[5].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[5].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        s1=new String();
        s1=Integer.toString(val[5])+" ";
        oup1.append(s1);
        intt+=2;
        if(val[5]==(Integer.parseInt(inp))){
            coun++;
            oup2+=new String(oup1)+"\n";
            ta.setText(oup2);
            
            try{Thread.sleep(1300);}catch(Exception e){}
            cir[16].setFill(Color.GREENYELLOW);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.ORANGE);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.DEEPPINK);
        }
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[6].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[6].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        s1=new String();
        s1=Integer.toString(val[6])+" ";
        oup1.append(s1);
        intt+=2;
        if(val[6]==(Integer.parseInt(inp))){
            
            coun++;
            oup2+=new String(oup1)+"\n";
            ta.setText(oup2);
            try{Thread.sleep(1300);}catch(Exception e){}
            cir[16].setFill(Color.GREENYELLOW);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.ORANGE);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.DEEPPINK);
        }
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[5].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[5].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        ////////////////////////////////delete
        oup1.delete(intt-2, intt);
        intt-=2;
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[7].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[7].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        s1=new String();
        s1=Integer.toString(val[7])+" ";
        oup1.append(s1);
        intt+=2;
        if(val[7]==(Integer.parseInt(inp))){
            
            
            oup2+=new String(oup1)+"\n";coun++;
            ta.setText(oup2);
            try{Thread.sleep(1300);}catch(Exception e){}
            cir[16].setFill(Color.GREENYELLOW);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.ORANGE);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.DEEPPINK);
        }
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[5].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[5].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        //////////////////////////////////////delete
        oup1.delete(intt-2, intt);
        intt-=2;
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[1].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[1].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        /////////////////////////////////////////del
        
        oup1.delete(intt-2, intt);
        intt-=2;
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[0].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[0].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        //////////////////////////////////////////////////del
        
        oup1.delete(intt-2, intt);
        intt-=2;
        //ttt.setText("ssssssssss");
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[8].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[8].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        s1=new String();
        s1=Integer.toString(val[8])+" ";
        oup1.append(s1);
        intt+=2;
        if(val[8]==(Integer.parseInt(inp))){
            
            coun++;
            oup2+=new String(oup1)+"\n";
            ta.setText(oup2);
            try{Thread.sleep(1300);}catch(Exception e){}
            cir[16].setFill(Color.GREENYELLOW);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.ORANGE);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.DEEPPINK);
        }
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[9].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[9].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        s1=new String();
        s1=Integer.toString(val[9])+" ";
        oup1.append(s1);
        intt+=2;
        if(val[9]==(Integer.parseInt(inp))){
            oup2+=new String(oup1)+"\n";
            ta.setText(oup2);
            
            coun++;
            try{Thread.sleep(1300);}catch(Exception e){}
            cir[16].setFill(Color.GREENYELLOW);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.ORANGE);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.DEEPPINK);
        }
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[10].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[10].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        s1=new String();
        s1=Integer.toString(val[10])+" ";
        oup1.append(s1);
        intt+=2;
        if(val[10]==(Integer.parseInt(inp))){
            
            coun++;
            oup2+=new String(oup1)+"\n";
            ta.setText(oup2);
            try{Thread.sleep(1300);}catch(Exception e){}
            cir[16].setFill(Color.GREENYELLOW);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.ORANGE);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.DEEPPINK);
        }
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[9].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[9].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
       /////////////////////////////del
       oup1.delete(intt-2, intt);
        intt-=2;
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[11].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[11].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        s1=new String();
        s1=Integer.toString(val[11])+" ";
        oup1.append(s1);
        intt+=2;
        if(val[11]==(Integer.parseInt(inp))){
            
            coun++;
            oup2+=new String(oup1)+"\n";
            ta.setText(oup2);
            try{Thread.sleep(1300);}catch(Exception e){}
            cir[16].setFill(Color.GREENYELLOW);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.ORANGE);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.DEEPPINK);
        }
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[9].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[9].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        //////////////////////del
        oup1.delete(intt-2, intt);
        intt-=2;
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[12].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[12].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        s1=new String();
        s1=Integer.toString(val[12])+" ";
        oup1.append(s1);
        intt+=2;
        if(val[12]==(Integer.parseInt(inp))){
            
            coun++;
            oup2+=new String(oup1)+"\n";
            ta.setText(oup2);
            try{Thread.sleep(1300);}catch(Exception e){}
            cir[16].setFill(Color.GREENYELLOW);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.ORANGE);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.DEEPPINK);
        }
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[9].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[9].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        /////////////////////////del
        oup1.delete(intt-2, intt);
        intt-=2;
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[8].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[8].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        ////////////////////////////////del
        oup1.delete(intt-2, intt);
        intt-=2;
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[13].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[13].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        s1=new String();
        s1=Integer.toString(val[13])+" ";
        oup1.append(s1);
        intt+=2;
        
        if(val[13]==(Integer.parseInt(inp))){
            
            coun++;
            oup2+=new String(oup1)+"\n";
            ta.setText(oup2);
            try{Thread.sleep(1300);}catch(Exception e){}
            cir[16].setFill(Color.GREENYELLOW);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.ORANGE);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.DEEPPINK);
        }
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[14].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[14].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        s1=new String();
        s1=Integer.toString(val[14])+" ";
        oup1.append(s1);
        intt+=2;
        if(val[14]==(Integer.parseInt(inp))){
            
            coun++;
            oup2+=new String(oup1)+"\n";
            ta.setText(oup2);
            try{Thread.sleep(1300);}catch(Exception e){}
            cir[16].setFill(Color.GREENYELLOW);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.ORANGE);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.DEEPPINK);
        }
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[13].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[13].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        //////////////////del
        oup1.delete(intt-2, intt);
        intt-=2;
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[15].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[15].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        s1=new String();
        s1=Integer.toString(val[15])+" ";
        oup1.append(s1);
        intt+=2;
        if(val[15]==(Integer.parseInt(inp))){
            
            coun++;
            oup2+=new String(oup1)+"\n";
            ta.setText(oup2);
            try{Thread.sleep(1300);}catch(Exception e){}
            cir[16].setFill(Color.GREENYELLOW);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.ORANGE);
            try{Thread.sleep(300);}catch(Exception e){}
            cir[16].setFill(Color.DEEPPINK);
        }
        
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[13].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[13].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[8].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[8].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        
        try{
        Thread.sleep(1500);}catch(Exception e){}
         tm=new Timeline();
        k1=new KeyFrame(Duration.seconds(1),
        new KeyValue(cir[16].layoutXProperty(),cir[0].getLayoutX()),
                new KeyValue(cir[16].layoutYProperty(),cir[0].getLayoutY())
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();
        
        //To change body of generated methods, choose Tools | Templates.
        
        if(coun == 0)ta.setText("Sorry,your desired number is absent");
    }
       
    
}
