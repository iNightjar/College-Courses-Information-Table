package tables.coursestables;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class levelTwoController implements Initializable {
    @FXML
    public TableView<modelTable> table;
    @FXML
    public TableColumn<modelTable, String> col_courseName ;
    @FXML
    public TableColumn<modelTable, String> col_lectureLocation ;
    @FXML
    public TableColumn<modelTable, String> col_lectureTime;
    @FXML
    public TableColumn<modelTable, String> col_sectionLocation;
    @FXML
    public TableColumn<modelTable, String> col_sectionTime;

    ObservableList<modelTable> observableList= FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try{
            Connection con = dbUtils.getConnection();
            ResultSet resultSet = con.createStatement().executeQuery("SELECT * from courses where course_year = 'general year two' ");
            while (resultSet.next()){
                observableList.add(new modelTable(resultSet.getString("code"),resultSet.getString("name"),resultSet.getString("lecture_location")
                        ,resultSet.getString("lecture_time"),resultSet.getString("section_location")
                        ,resultSet.getString("section_time")));
            }
        } catch (SQLException e) {
            //e.printStackTrace();
            Logger.getLogger(levelOneController.class.getName()).log(Level.SEVERE, null, e);
        }
        col_courseName.setCellValueFactory(new PropertyValueFactory<>("courseName"));
        col_lectureLocation.setCellValueFactory(new PropertyValueFactory<>("lectureLocation"));
        col_lectureTime.setCellValueFactory(new PropertyValueFactory<>("lectureTime"));
        col_sectionLocation.setCellValueFactory(new PropertyValueFactory<>("sectionLocation"));
        col_sectionTime.setCellValueFactory(new PropertyValueFactory<>("sectionTime"));
        table.setItems(observableList);
    }
    @FXML
    Button levelOneBtn,levelTwoBtn, levelThreeBtn,levelFourBtn,backHomeBtn;

    public void handleLevelOneBtn() throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("level1.fxml")));
        Stage window = (Stage) levelOneBtn.getScene().getWindow();
        window.setResizable(false);
        window.setScene(new Scene(root, 650 , 433));
    }
    public void handleBackHomeBtn() throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("studentView.fxml")));
        Stage window = (Stage) backHomeBtn.getScene().getWindow();
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