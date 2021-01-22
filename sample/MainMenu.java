package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainMenu {
    private Main main;

    @FXML
    Button sortings, BFSDij, DFS;

    @FXML
    void enterSortings(ActionEvent action){
        try {
            main.Sortings();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void enterBFSDij(ActionEvent action){
        try {
            main.BFSDijkstra();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void enterDFS(ActionEvent action){
        try {
            main.DFS();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void setMain(Main main) {
        this.main = main;
    }
}
