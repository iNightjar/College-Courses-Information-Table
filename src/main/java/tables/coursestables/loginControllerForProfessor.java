package tables.coursestables;

import java.sql.*;
import java.util.Date;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;


public class loginControllerForProfessor implements Initializable {
        @FXML
        public TextField username;
        public TextField password;
        @FXML
        public Button backHomePage, logInBtn;
        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
            logInBtn.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    dbUtils.logInUserForProfessorPage(event, username.getText(), password.getText());
                }
            });
        }
        public void handleBackButton() throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("homeView.fxml")));
        Stage window = (Stage) backHomePage.getScene().getWindow();
        window.setResizable(false);
        window.setScene(new Scene(root, 650 , 433));
    }

}