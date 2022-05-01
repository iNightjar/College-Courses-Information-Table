package tables.coursestables;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.util.Objects;

public class studentController {
    @FXML
    Button profBtn, demoBtn, backHomeBtn, levelOneBtn,levelTwoBtn,levelThreeBtn, levelFourBtn;

    public void handleProfBtn() throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("loginViewForProfessor.fxml")));
        Stage window = (Stage) profBtn.getScene().getWindow();
        window.setResizable(false);
        window.setScene(new Scene(root, 884 , 575));
    }
    public void handleDemoBtn() throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("loginViewForDemo.fxml")));
        Stage window = (Stage) demoBtn.getScene().getWindow();
        window.setResizable(false);
        window.setScene(new Scene(root, 884 , 575));
    }
    public void handleBackHomeBtn() throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("homeView.fxml")));
        Stage window = (Stage) backHomeBtn.getScene().getWindow();
        window.setResizable(false);
        window.setScene(new Scene(root, 650 , 433));
    }
    public void handleLevelOneBtn() throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("level1.fxml")));
        Stage window = (Stage) levelOneBtn.getScene().getWindow();
        window.setResizable(false);
        window.setScene(new Scene(root, 650 , 433));
    }
    public void handleLevelTwoBtn() throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("level2.fxml")));
        Stage window = (Stage) levelTwoBtn.getScene().getWindow();
        window.setResizable(false);
        window.setScene(new Scene(root, 650 , 433));
    }
    public void handleLevelThreeBtn() throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("level3.fxml")));
        Stage window = (Stage) levelThreeBtn.getScene().getWindow();
        window.setResizable(false);
        window.setScene(new Scene(root, 650 , 433));
    }
    public void handleLevelFourBtn() throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("level4.fxml")));
        Stage window = (Stage) levelFourBtn.getScene().getWindow();
        window.setResizable(false);
        window.setScene(new Scene(root, 650 , 433));
    }
}