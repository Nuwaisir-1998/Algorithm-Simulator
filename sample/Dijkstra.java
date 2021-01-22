package sample;

import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;

public class Dijkstra implements Runnable{
    int visited[] = new int[20];
    int level[] = new int[20];
    Text[] TX, dxy;
    Button[] nodes;
    Circle[] circles, cirover;

    Vector<Button>[]adj = new Vector[20];
    Vector<Button> q = new Vector<>();
    GraphController g = new GraphController();
    int [] distance = new int[20];

    Text res;
    Button b;
    Button l;
    int cost[][] = new int[11][11];

    public Dijkstra(Button b, Button l, Vector<Button>[] adj, Text[] TX,Text[] dxy, int [][] cost, Text res, Circle[] circles, Button[] nodes, Circle[] cirover) {
        Thread t = new Thread(this);
        this.cirover = cirover;
        this.circles = circles;
        this.nodes = nodes;
        this.TX = TX;
        this.adj = adj;
        this.res = res;
        this.b = b;
        this.l = l;
        this.dxy = dxy;
        this.cost = cost;
        for(int i=0;i<20;i++){
            distance[i] = 10000;
        }
        t.start();
    }

    @Override
    public void run() {

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
        cirover[Integer.parseInt(b.getText())-1].setOpacity(.5);
        visited[Integer.parseInt(b.getText())] = 1;
        level[Integer.parseInt(b.getText())] = 0;

        TX[Integer.parseInt(b.getText())-1].setText("0");
        try{Thread.sleep(700);}catch (Exception e){e.printStackTrace();}

        distance[Integer.parseInt(b.getText())] = 0;

        while(!q.isEmpty()){
            int mn = 10000, id = 0;
            for(int k=0;k<q.size();k++){
                if(distance[Integer.parseInt(q.get(k).getText())] < mn) {
                    mn = distance[Integer.parseInt(q.get(k).getText())];
                    id = k;
                }
            }
            Button u = q.remove(id);
            for(int j=0;j<adj[Integer.parseInt(u.getText())].size();j++){
                int idx = Integer.parseInt(adj[Integer.parseInt(u.getText())].get(j).getText());
                if(distance[Integer.parseInt(u.getText())] + cost[Integer.parseInt(u.getText())][idx] < distance[idx]){
                    q.add(adj[Integer.parseInt(u.getText())].get(j));
                    distance[idx] = distance[Integer.parseInt(u.getText())] + cost[Integer.parseInt(u.getText())][idx];
                    TX[idx-1].setText(String.valueOf(distance[idx]));

                    g.showPath(circles[Integer.parseInt(u.getText())-1], circles[idx-1], nodes[Integer.parseInt(u.getText())-1]);
                    try {
                        Thread.sleep(750);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    cirover[idx-1].setOpacity(.5);
                }
                visited[idx] = 1;
            }
            try{Thread.sleep(700);}catch (Exception e){e.printStackTrace();}
        }

        System.out.println("shortest path : " + distance[Integer.parseInt(l.getText())]);

        res.setText(String.valueOf(distance[Integer.parseInt(l.getText())]));
    }
}
