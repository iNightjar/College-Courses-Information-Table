package tables.coursestables;
import java.io.IOException;
import java.util.Objects;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class homeController {
    @FXML
  Button profBtn, studentBtn, demoBtn;

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
    public void handleStudentBtn() throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("studentView.fxml")));
        Stage window = (Stage) studentBtn.getScene().getWindow();
        window.setResizable(false);
        window.setScene(new Scene(root, 650 , 433));
    }
}
