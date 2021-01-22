package sample;

import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ThreadForInsertionSort extends Thread{
    private Controller c = new Controller();
    private Rectangle r1[] = new Rectangle[10];
    private TextField t1[] = new TextField[10];

    ThreadForInsertionSort(Rectangle []ra, TextField []ta){
        System.arraycopy(ra, 0, r1, 0, 8);
        System.arraycopy(ta, 0, t1, 0, 8);
    }

    public void run(){
        int i, j;
        double key;
        for (i = 1; i < 8; i++)
        {
            key = r1[i].getHeight();
            j = i-1;

       /* Move elements of arr[0..i-1], that are
          greater than key, to one position ahead
          of their current position */
            while (j >= 0 && r1[j].getHeight() > key)
            {
                //r1[j+1].setHeight(r1[j].getHeight());
               //System.out.println("dhukse");
                c.swapRectanglesAndTheirHeights(r1[j], r1[j+1], t1[j], t1[j+1]);
//                String s = t1[j].getText();
//                t1[j].setText(t1[j+1].getText());
//                t1[j+1].setText(s);

                //t1[j+1].setText(t1[j].getText());
//                c.updateRectangleHeight(t1[j], r1[j]);
//                c.updateRectangleHeight(t1[j+1], r1[j+1]);
                c.changeColorOfRectangle(r1[j], Color.RED);
                c.changeColorOfRectangle(r1[j + 1], Color.RED);
                try {
                    Thread.sleep(650);
                } catch (Exception e) {
                    System.out.println("Exception found(Insertion)");
                }
                c.changeColorOfRectangle(r1[j], Color.DODGERBLUE);
                c.changeColorOfRectangle(r1[j + 1], Color.DODGERBLUE);
                j = j-1;
            }
            //r1[j+1].setHeight(key);
            //t1[j+1].setText(String.valueOf(key));
            //c.updateRectangleHeight(t1[j+1], r1[j+1]);
        }

        for (i = 0; i < 8; i++) {
            r1[i].setFill(Color.rgb(76, 242, 4));
            try {
                Thread.sleep(105);
            } catch (Exception e) {
                System.out.println("Exception found(Insertion)");
            }
        }
    }
}
