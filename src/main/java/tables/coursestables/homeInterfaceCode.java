package tables.coursestables;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class homeInterfaceCode extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
       Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("homeView.fxml")));
       primaryStage.setTitle("Home Page!");
       primaryStage.setScene(new Scene(root, 650 , 433));
       primaryStage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
