package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import javafx.fxml.FXML;

import javax.xml.soap.Text;

import java.awt.event.ActionEvent;

import static javafx.scene.paint.Color.*;

public class Controller{

    @FXML
    Circle c;

    @FXML
    Button button, buttonForSelectionSort, buttonForInsertionSort, Refresh, play, pause, back;

    @FXML
    private TextField t1, t2, t3, t4, t5, t6, t7, t8;

    @FXML
    private Rectangle r1, r2, r3, r4, r5, r6, r7, r8;

    @FXML
    private Rectangle R[] = new Rectangle[10];

    @FXML
    private TextField T[] = new TextField[10];
    private TextField copyT[] = new TextField[10];

    @FXML
    void goBack(){
        try {
            main.showMainMenu();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    void enterMergeSort(){
        try {
            main.Merge();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




    @FXML
    private void doRefresh(){
        t1.setText("50.0");
        t2.setText("180.0");
        t3.setText("170.0");
        t4.setText("195.0");
        t5.setText("100.0");
        t6.setText("80.0");
        t7.setText("50.0");
        t8.setText("100.0");
        Rectangle [] rectangles = {r1, r2, r3, r4, r5, r6, r7, r8};
        for(int i=0;i<8;i++){
            rectangles[i].setFill(Color.DODGERBLUE);
        }
        generate();
    }

    private Main main;
    void setMain(Main main) {
        this.main = main;
    }



    double multiplyer = 1;
    @FXML
    private void generate(){
        Rectangle [] rectangles = {r1, r2, r3, r4, r5, r6, r7, r8};
        TextField [] textFields = {t1, t2, t3, t4, t5, t6, t7, t8};
        double max = 0;
        for(int i=0;i<8;i++){
            if(Double.parseDouble(textFields[i].getText()) > max){
                //multiplyer = 310 / rectangles[i].getHeight();
                max = Double.parseDouble(textFields[i].getText());
            }
        }

        if(max >= 310){
            multiplyer = 310 / max;
        }
        else{
            multiplyer = 1;
        }

        System.out.println(multiplyer) ;

        updateRectangleHeight(t1, r1);
        updateRectangleHeight(t2, r2);
        updateRectangleHeight(t3, r3);
        updateRectangleHeight(t4, r4);
        updateRectangleHeight(t5, r5);
        updateRectangleHeight(t6, r6);
        updateRectangleHeight(t7, r7);
        updateRectangleHeight(t8, r8);
    }

    void updateRectangleHeight(TextField t, Rectangle r){
        try {
            String s = t.getText();
            double h =Double.parseDouble(s);
            r.setLayoutY(310 - h*multiplyer);
            r.setHeight(h*multiplyer);
        }catch(NullPointerException e){
            System.out.println("NullPointerException found inside updateRectangle method");
        }
    }

    @FXML
    void startBubbleSort(){
        //Rectangle R[] = {r1,r2,r3,r4,r5,r6,r7,r8};
        //TextField T[] = {t1,t2,t3,t4,t5,t6,t7,t8};
        R[0] = r1;R[1] = r2;R[2] = r3;R[3] = r4;R[4] = r5;R[5] = r6;R[6] = r7;R[7] = r8;
        T[0] = t1;T[1] = t2;T[2] = t3;T[3] = t4;T[4] = t5;T[5] = t6;T[6] = t7;T[7] = t8;
        ThreadForBubbleSort bubble = new ThreadForBubbleSort(R, T);
//        bubble.start();
        //try{bubble.join();}catch (Exception e){}
    }

    @FXML
    void startSelectionSort(){
        //Rectangle R[] = {r1,r2,r3,r4,r5,r6,r7,r8};
        //TextField T[] = {t1,t2,t3,t4,t5,t6,t7,t8};
        R[0] = r1;R[1] = r2;R[2] = r3;R[3] = r4;R[4] = r5;R[5] = r6;R[6] = r7;R[7] = r8;
        T[0] = t1;T[1] = t2;T[2] = t3;T[3] = t4;T[4] = t5;T[5] = t6;T[6] = t7;T[7] = t8;
        ThreadForSelectionSort selection = new ThreadForSelectionSort(R, T);
        selection.start();
        //try{selection.join();}catch (Exception e){}
    }

    @FXML
    void startInsertionSort(){
        //Rectangle R[] = {r1,r2,r3,r4,r5,r6,r7,r8};
        //TextField T[] = {t1,t2,t3,t4,t5,t6,t7,t8};
        R[0] = r1;R[1] = r2;R[2] = r3;R[3] = r4;R[4] = r5;R[5] = r6;R[6] = r7;R[7] = r8;
        T[0] = t1;T[1] = t2;T[2] = t3;T[3] = t4;T[4] = t5;T[5] = t6;T[6] = t7;T[7] = t8;
        ThreadForInsertionSort insertion = new ThreadForInsertionSort(R, T);
        insertion.start();
        //try{insertion.join();}catch (Exception e){}
    }

    void changeColorOfRectangle(Rectangle R, Color c){
        if(c == RED)R.setFill(RED);
        if(c == BLUE)R.setFill(BLUE);
        if(c ==  DODGERBLUE)R.setFill(DODGERBLUE);
    }

    void swapRectanglesAndTheirHeights(Rectangle R1, Rectangle R2, TextField T1, TextField T2) {

        if (R1.getHeight() > R2.getHeight()) {
            Timeline tr1 = new Timeline();
            Timeline tr2 = new Timeline();

            KeyFrame kr1 = new KeyFrame(Duration.seconds(0.25),
                    new KeyValue(R1.layoutXProperty(), R2.getLayoutX()),
                    new KeyValue(R1.layoutYProperty(), 310 - R1.getHeight()));

            KeyFrame kr2 = new KeyFrame(Duration.seconds(.25),
                    new KeyValue(R2.layoutXProperty(), R1.getLayoutX()),
                    new KeyValue(R2.layoutYProperty(), 310 - R2.getHeight()));

            tr1.getKeyFrames().addAll(kr1);
            tr2.getKeyFrames().addAll(kr2);

            double temp = R1.getHeight();
            T1.setText(String.valueOf(R2.getHeight()));
            T2.setText(String.valueOf(temp));

            tr1.setOnFinished(event -> {
                R1.setLayoutX(T1.getLayoutX());
                updateRectangleHeight(T1, R1);
//                R2.setLayoutX(T2.getLayoutX());
//                updateRectangleHeight(T2, R2);
            });

            tr2.setOnFinished(event -> {
                R2.setLayoutX(T2.getLayoutX());
                updateRectangleHeight(T2, R2); });


            tr1.play();
            tr2.play();

        }
    }
}
