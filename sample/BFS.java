package sample;

import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class BFS implements Runnable{
    int visited[] = new int[20];
    int level[] = new int[20];
    Text [] TX = new Text[20];
    Circle[] circles, cirover;
    Vector<Button>[]adj = new Vector[20];
    Queue<Button> q = new LinkedList<>();
    GraphController g = new GraphController();
    Button[] nodes;
    Text res;

    Button b;
    Button l;

    BFS(Button b, Button l, Vector<Button>[] adj, Text[] TX, Text res, Circle[] circles, Button[] nodes, Circle[] cirover){
        Thread t = new Thread(this);
        this.cirover = cirover;
        this.circles = circles;
        this.nodes = nodes;
        this.b = b;
        this.l = l;
        this.adj = adj;
        this.TX = TX;
        this.res = res;
        t.start();
    }
    @Override
    public void run() {
        //Text[] TX = {tx1, tx2, tx3, tx4, tx5, tx6, tx7, tx8, tx9};
        for(int i=0;i<9;i++){
            cirover[i].setOpacity(0);
        }
        try{Thread.sleep(70);}catch (Exception e){e.printStackTrace();}

        for(int i = 0; i< 9;i++){
            TX[i].setText(" ");
        }
        for(int i=0;i<20;i++){
            visited[i] = 0;
            level[i] = -1;
        }
        q.add(b);
        visited[Integer.parseInt(b.getText())] = 1;
        level[Integer.parseInt(b.getText())] = 0;

        TX[Integer.parseInt(b.getText())-1].setText("0");
        cirover[Integer.parseInt(b.getText())-1].setOpacity(.5);
        try{Thread.sleep(700);}catch (Exception e){e.printStackTrace();}

        while(!q.isEmpty()){
            Button u = q.remove();

            for(int j=0;j<adj[Integer.parseInt(u.getText())].size();j++){
                int idx = Integer.parseInt(adj[Integer.parseInt(u.getText())].get(j).getText());
                if(level[idx] == -1){
                    q.add(adj[Integer.parseInt(u.getText())].get(j));
                    g.showPath(circles[Integer.parseInt(u.getText())-1], circles[idx-1], nodes[Integer.parseInt(u.getText())-1]);
                    try {
                        Thread.sleep(750);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    cirover[idx-1].setOpacity(.5);
                    level[idx] = (level[Integer.parseInt(u.getText())] + 1);
                    TX[idx-1].setText(String.valueOf(level[idx]));
                }
                visited[idx] = 1;
            }
            try{Thread.sleep(700);}catch (Exception e){e.printStackTrace();}
        }

        System.out.println("shortest path : " + level[Integer.parseInt(l.getText())]);

        res.setText(String.valueOf(level[Integer.parseInt(l.getText())]));


    }
}
