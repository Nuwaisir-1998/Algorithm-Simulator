package sample;

import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.time.Duration;

public class ThreadForBubbleSort implements Runnable{

    private Controller c = new Controller();
    private Rectangle r1[] = new Rectangle[10];
    private TextField t1[] = new TextField[10];
    boolean sata;

    ThreadForBubbleSort(){

    }

    ThreadForBubbleSort(Rectangle []ra, TextField []ta){
//        System.arraycopy(ra, 0, r1, 0, 8);
//        System.arraycopy(ta, 0, t1, 0, 8);
        Thread t = new Thread(this);
        r1 = ra;
        t1 = ta;
        sata = true;
        t.start();
    }

    static int bondho = 0;


    @Override
    public void run() {
        try {
            for (int j = 0; j < 7; j++) {
                for (int i = 0; i < 7 - j; i++) {
                    c.swapRectanglesAndTheirHeights(r1[i], r1[i + 1], t1[i], t1[i + 1]);
                    c.changeColorOfRectangle(r1[i], Color.RED);
                    c.changeColorOfRectangle(r1[i + 1], Color.RED);

                    System.out.println(bondho);
                    try {
                        Thread.sleep(750);
                    } catch (Exception e) {
                        System.out.println("Exception found(Bubble)");
                    }
                    c.changeColorOfRectangle(r1[i], Color.DODGERBLUE);
                    c.changeColorOfRectangle(r1[i + 1], Color.DODGERBLUE);

                    try {
                        synchronized (this) {
                            while (!sata) {
                                wait();
                            }
                        }
                    } catch (Exception e) {

                    }
                }

            }

            for (int i = 0; i < 8; i++) {
                r1[i].setFill(Color.rgb(76, 242, 4));
                try {
                    Thread.sleep(105);
                } catch (Exception e) {
                    System.out.println("Exception found(Bubble)");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized void setSata(){
        sata = false;
    }

    synchronized void play(){
        sata = true;
        notify();
    }
}
