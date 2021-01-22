package sample;

import java.util.Vector;

//import Merge.src.FXMLDocumentController;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXMLLoader;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class Thre extends Thread{
  // public int p;
   //public int q;
   public Text[] tex=new Text[8];
   public FXMLDocumentController fxc;
   

    Thre(Text[] texy) {
         for(int i=0;i<8;i++)tex[i]=texy[i];
}
    @Override
    public void run() {
        runni2(0,4,0);
        try{
            Thread.sleep(500);
        }catch(Exception e){}
        runni2(0,4,4);
        try{
            Thread.sleep(500);
        }catch(Exception e){}
        runni2(0,8,0);
        for(int t=0;t<8;t++)System.out.println(tex[t].getText()+" ");
}
   
   
   public void runni2(int a1,int a2,int a3){
       Text[] index=new Text[a2];
        int in=0,p=0,q=0,a22=a2/2;
        int mm=0,nn=0,hh=0;
        if(a2==4){mm=40;nn=150;}
        if(a2==8){mm=32;nn=230;hh=70;}
        //int[] ind=new int[4];
        fxc=new FXMLDocumentController();
        for(int i=0;i<a2;i++){
            
            if(p==a22){while(q<a22){
                Timeline tm=new Timeline();
             KeyFrame k1=new KeyFrame(Duration.seconds(.5),
        new KeyValue(tex[q+a22+a3].layoutXProperty(),i*mm+nn+70*a3),
                new KeyValue(tex[q+a22+a3].layoutYProperty(),200-hh)
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();  
        index[i]=tex[q+a22+a3];
        q++;
         i++;  
         try{Thread.sleep(1600);}catch(Exception e){}
            }}
           else if(q==a22){
              while(p<a22){
                Timeline tm=new Timeline();
             KeyFrame k1=new KeyFrame(Duration.seconds(.5),
        new KeyValue(tex[p+a3].layoutXProperty(),i*mm+nn+70*a3),
                new KeyValue(tex[p+a3].layoutYProperty(),200-hh)
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();  
        index[i]=tex[p+a3];
        p++;
         i++;   try{Thread.sleep(1600);}catch(Exception e){}    
            }
           }
           else{ 
            double d1=Double.parseDouble(tex[p+a3].getText());
            double d2=Double.parseDouble(tex[q+a3+a22].getText());
            
          if(d1<=d2){
               Timeline tm=new Timeline();//////////////////////////////color dibo
             KeyFrame k1=new KeyFrame(Duration.seconds(.5),
        new KeyValue(tex[p+a3].layoutXProperty(),i*mm+nn+70*a3),
                new KeyValue(tex[p+a3].layoutYProperty(),200-hh)
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();  ///////////////////clor dibo
        index[i]=tex[p+a3];
//index[in++]=p;
        p++;
            }
            else {
                Timeline tm=new Timeline();
             KeyFrame k1=new KeyFrame(Duration.seconds(.5),
        new KeyValue(tex[q+a22+a3].layoutXProperty(),i*mm+nn+70*a3),
                new KeyValue(tex[q+a22+a3].layoutYProperty(),200-hh)
        );
        tm.getKeyFrames().addAll(k1);
        tm.play();  
        index[i]=tex[q+a22+a3];
        q++;
                
            }}
        //fxc.ani(fxc.p,fxc.q,i);
        try{
        Thread.sleep(1600); 
        }catch(Exception e){}
        
        }
      for(int i=a3;i<a3+a2;i++)tex[i]=index[i-a3];//System.out.println(index[i].getText()+" ");
//To change body of generated methods, choose Tools | Templates.
    }
   
   
   }

