package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;


public class GraphController {

    @FXML
    TextField source, end;
    Vector<Button> []adj = new Vector[20];
    Queue<Button> q = new LinkedList<>();
    int cost[][] = new int[11][11];

    @FXML
    Circle c1, c2, c3, c4, c5, c6,c7, c8, c9, cc1, cc2, cc3, cc4, cc5, cc6,cc7, cc8, cc9;
    @FXML
    Button n1, n2, n3, n4, n5, n6, n7, n8, n9;
    @FXML
    Text tx1, tx2, tx3, tx4, tx5, tx6, tx7, tx8, tx9, res;
    @FXML
    Text d12, d13, d34, d37, d49, d78, d25, d26, d17;
    @FXML
    void f(){

    }


    @FXML
    void startBFS(){

        Circle[] cirover = {cc1, cc2, cc3, cc4, cc5, cc6,cc7, cc8, cc9};

        Circle[] circles = {c1, c2, c3, c4, c5, c6, c7, c8, c9};

        Text []dxy = {d12, d13, d34, d37, d49, d78, d25, d26, d17};

        for(int i = 0;i < 9;i++){
            dxy[i].setText(" ");
        }
        setAdjList();
        Text[] TX = {tx1, tx2, tx3, tx4, tx5, tx6, tx7, tx8, tx9};
        Button []node = {n1, n2, n3, n4, n5, n6, n7, n8, n9};
//        source.setText("1");
//        end.setText("9");

        int s = (Integer.parseInt(source.getText()));
        int e = (Integer.parseInt(end.getText()));

        BFS bfs = new BFS(node[s-1], node[e-1], adj, TX, res, circles, node, cirover);

//        for(int i = 0;i < 9;i++){
//            dxy[i].setText(String.valueOf(edgeCost[i]));
//        }
    }

    @FXML
    void goBack(){
        try {
            main.showMainMenu();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    void startDijkstra(){

      // Button []node = {n1, n2, n3, n4, n5, n6, n7, n8, n9};

        Circle[] cirover = {cc1, cc2, cc3, cc4, cc5, cc6,cc7, cc8, cc9};

        Circle[] circles = {c1, c2, c3, c4, c5, c6, c7, c8, c9};

        Text []dxy = {d12, d13, d34, d37, d49, d78, d25, d26, d17};


        setAdjList();
        Text[] TX = {tx1, tx2, tx3, tx4, tx5, tx6, tx7, tx8, tx9};
        Button []node = {n1, n2, n3, n4, n5, n6, n7, n8, n9};
//        source.setText("1");
//        end.setText("9");
        setCost();

        int s = (Integer.parseInt(source.getText()));
        int e = (Integer.parseInt(end.getText()));

        Dijkstra d = new Dijkstra(node[s-1], node[e-1], adj, TX, dxy, cost, res,  circles, node, cirover);

//        for(int i = 0;i < 9;i++){
//            dxy[i].setText(String.valueOf(edgeCost[i]));
//        }
    }

    private Main main;
    void setMain(Main main) {
        this.main = main;
    }

    void setAdjList()
    {
        for(int i=1;i<=10;i++) {
            adj[i] = new Vector<>(10);
        }

        adj[1].add(n2); adj[1].add(n3); adj[1].add(n7);
//        cost[1][2] = Integer.parseInt(d12.getText());
//        cost[1][3] = Integer.parseInt(d13.getText());
//        cost[1][7] = Integer.parseInt(d17.getText());


        adj[2].add(n1); adj[2].add(n5); adj[2].add(n6);
//        cost[2][1] = Integer.parseInt(d12.getText());
//        cost[2][5] = Integer.parseInt(d25.getText());
//        cost[2][6] = Integer.parseInt(d26.getText());

        adj[3].add(n1); adj[3].add(n4); adj[3].add(n7);
//        cost[3][1] = Integer.parseInt(d13.getText());
//        cost[3][4] = Integer.parseInt(d34.getText());
//        cost[3][7] = Integer.parseInt(d37.getText());

        adj[4].add(n3); adj[4].add(n9);
//        cost[4][3] = Integer.parseInt(d34.getText());
//        cost[4][9] = Integer.parseInt(d49.getText());

        adj[5].add(n2);
//        cost[5][2] = Integer.parseInt(d25.getText());

        adj[6].add(n2);
//        cost[6][2] = Integer.parseInt(d26.getText());

        adj[7].add(n1); adj[7].add(n3); adj[7].add(n8);
//        cost[7][1] = Integer.parseInt(d17.getText());
//        cost[7][3] = Integer.parseInt(d37.getText());
//        cost[7][8] = Integer.parseInt(d78.getText());

        adj[8].add(n7);
//        cost[8][7] = Integer.parseInt(d78.getText());

        adj[9].add(n4);
//        cost[9][4] = Integer.parseInt(d49.getText());



        for(int i=1;i<=9;i++){
            for(int j=0;j<adj[i].size();j++){
                System.out.print(adj[i].get(j).getText() + " ");
            }
            System.out.println();
        }
    }

    void setCost(){
        d12.setText("9");
        d13.setText("5");
        d17.setText("25");
        d25.setText("19");
        d26.setText("7");
        d34.setText("4");
        d37.setText("18");
        d49.setText("5");
        d78.setText("2");

        cost[1][2] = Integer.parseInt(d12.getText());
        cost[1][3] = Integer.parseInt(d13.getText());
        cost[1][7] = Integer.parseInt(d17.getText());

        cost[2][1] = Integer.parseInt(d12.getText());
        cost[2][5] = Integer.parseInt(d25.getText());
        cost[2][6] = Integer.parseInt(d26.getText());

        cost[3][1] = Integer.parseInt(d13.getText());
        cost[3][4] = Integer.parseInt(d34.getText());
        cost[3][7] = Integer.parseInt(d37.getText());

        cost[4][3] = Integer.parseInt(d34.getText());
        cost[4][9] = Integer.parseInt(d49.getText());

        cost[5][2] = Integer.parseInt(d25.getText());

        cost[5][2] = Integer.parseInt(d25.getText());

        cost[7][1] = Integer.parseInt(d17.getText());
        cost[7][3] = Integer.parseInt(d37.getText());
        cost[7][8] = Integer.parseInt(d78.getText());

        cost[8][7] = Integer.parseInt(d78.getText());

        cost[9][4] = Integer.parseInt(d49.getText());
    }


    void showPath(Circle C1, Circle C2, Button N1) {


            Timeline tr1 = new Timeline();
            //Timeline tr2 = new Timeline();

            KeyFrame kr1 = new KeyFrame(Duration.seconds(0.55),
                    new KeyValue(C1.layoutXProperty(), C2.getLayoutX()),
                    new KeyValue(C1.layoutYProperty(), C2.getLayoutY()));

//            KeyFrame kr2 = new KeyFrame(Duration.seconds(.25),
//                    new KeyValue(R2.layoutXProperty(), R1.getLayoutX()),
//                    new KeyValue(R2.layoutYProperty(), 310 - R2.getHeight()));

            tr1.getKeyFrames().addAll(kr1);
            //tr2.getKeyFrames().addAll(kr2);

//            double temp = R1.getHeight();
//            T1.setText(String.valueOf(R2.getHeight()));
//            T2.setText(String.valueOf(temp));

            tr1.setOnFinished(event -> {
                C1.setLayoutX(N1.getLayoutX() + 21);
                C1.setLayoutY(N1.getLayoutY() + 21);

                //updateRectangleHeight(T1, R1);
//                R2.setLayoutX(T2.getLayoutX());
//                updateRectangleHeight(T2, R2);
            });

//            tr2.setOnFinished(event -> {
//                R2.setLayoutX(T2.getLayoutX());
//                updateRectangleHeight(T2, R2); });


            tr1.play();
            //tr2.play();


    }




}