package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Algorithm_Simulator");
//        primaryStage.setScene(new Scene(root, 800, 650));
//        primaryStage.show();

        stage = primaryStage;
        showMainMenu();
    }

    public void showMainMenu() throws Exception {
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Main_Menu.fxml"));
        Parent root = loader.load();

        // Loading the controller
        MainMenu controller = loader.getController();
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Login");
        stage.setScene(new Scene(root, 800, 650));
        stage.show();
    }


    public void Sortings() throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("sample.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Controller controller = loader.getController();
        //controller.init(userName);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Sorting Algorithms");
        stage.setScene(new Scene(root, 800, 650));
        stage.show();
    }

    public void BFSDijkstra() throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("graph.fxml"));
        Parent root = loader.load();

        // Loading the controller
        GraphController controller = loader.getController();
        //controller.init(userName);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("BFS & Dijsktra Algorithms");
        stage.setScene(new Scene(root, 800, 650));
        stage.show();
    }

    public void Merge() throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("FXMLDocument.fxml"));
        Parent root = loader.load();

        // Loading the controller
        FXMLDocumentController controller = loader.getController();
        //controller.init(userName);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Merge Sort");
        stage.setScene(new Scene(root, 800, 650));
        stage.show();
    }

    public void DFS() throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("SC3.fxml"));
        Parent root = loader.load();

        // Loading the controller
        SC3Controller controller = loader.getController();
        //controller.init(userName);
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("DFS");
        stage.setScene(new Scene(root, 800, 650));
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}