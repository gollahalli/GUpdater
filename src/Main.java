import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/resource/GUpdater-gui.fxml"));
        } catch (IOException e) {
        }

        Scene scene = new Scene(root, 600, 400);
        primaryStage.getIcons().add(new Image("/resource/g-4.png"));
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.setTitle("GUpdater - Auto updater");
        primaryStage.show();
    }
}