/**
 * Created by Sidney on 2/3/2017.
 */
import javafx.fxml.FXMLLoader;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage window;
    private double width = 800;
    private double height = 664;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.window = primaryStage;
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("view/mainView.fxml"));
        window.setTitle("Poker AI");
        root.setId("pane");

        Scene scene = new Scene(root, width, height);
        scene.getStylesheets().addAll(this.getClass().getResource("resources/style.css").toExternalForm());
        window.setScene(scene);
        window.centerOnScreen();
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}

