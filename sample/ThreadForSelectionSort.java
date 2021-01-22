package sample;

import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ThreadForSelectionSort extends Thread{
    private Controller c = new Controller();
    private Rectangle r1[] = new Rectangle[10];
    private TextField t1[] = new TextField[10];

    ThreadForSelectionSort(Rectangle []ra, TextField []ta){
        System.arraycopy(ra, 0, r1, 0, 8);
        System.arraycopy(ta, 0, t1, 0, 8);
    }

    public void run()
    {
        double mn; int idx, j;
        for(int i=0;i<7;i++){
            mn = r1[i].getHeight();
            idx = i;
            for(j=i+1;j<8;j++){
                c.changeColorOfRectangle(r1[j], Color.RED);
                try {
                    Thread.sleep(550);
                } catch (Exception e) {}
                c.changeColorOfRectangle(r1[j], Color.DODGERBLUE);
                if(r1[j].getHeight() < mn){
                    mn = r1[j].getHeight();
                    idx = j;
                }
            }

            if(idx != i){
                c.swapRectanglesAndTheirHeights(r1[i], r1[idx], t1[i], t1[idx]);
                c.changeColorOfRectangle(r1[i], Color.RED);
                c.changeColorOfRectangle(r1[idx], Color.RED);
                try {
                    Thread.sleep(850);
                } catch (Exception e) {
                    System.out.println("Exception found(Selection)");
                }
                c.changeColorOfRectangle(r1[i], Color.DODGERBLUE);
                c.changeColorOfRectangle(r1[idx], Color.DODGERBLUE);
            }
        }

        for (int i = 0; i < 8; i++) {
            r1[i].setFill(Color.rgb(76, 242, 4));
            try {
                Thread.sleep(105);
            } catch (Exception e) {
                System.out.println("Exception found(Selection)");
            }
        }
    }
}
