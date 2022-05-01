package tables.coursestables;

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

public class professorController implements Initializable {
    @FXML
    public TableView<modelTable> table;
    @FXML
    public TableColumn<modelTable, String> col_courseCode ;
    @FXML
    public TableColumn<modelTable, String> col_courseName ;
    @FXML
    public TableColumn<modelTable, String> col_lectureLocation ;
    @FXML
    public TableColumn<modelTable, String> col_lectureTime;

    ObservableList<modelTable> observableList= FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try{
            Connection con = dbUtils.getConnection();
            ResultSet resultSet = con.createStatement().executeQuery("SELECT * from courses ");
            while (resultSet.next()){
                observableList.add(new modelTable(resultSet.getString("code"),resultSet.getString("name"),resultSet.getString("lecture_location")
                        ,resultSet.getString("lecture_time"),resultSet.getString("section_location")
                        ,resultSet.getString("section_time")));
            }
        } catch (SQLException e) {
            //e.printStackTrace();
            Logger.getLogger(levelOneController.class.getName()).log(Level.SEVERE, null, e);
        }
        col_courseCode.setCellValueFactory(new PropertyValueFactory<>("courseCode"));
        col_courseName.setCellValueFactory(new PropertyValueFactory<>("courseName"));
        col_lectureLocation.setCellValueFactory(new PropertyValueFactory<>("lectureLocation"));
        col_lectureTime.setCellValueFactory(new PropertyValueFactory<>("lectureTime"));
        //col_sectionLocation.setCellValueFactory(new PropertyValueFactory<>("sectionLocation"));
        //col_sectionTime.setCellValueFactory(new PropertyValueFactory<>("sectionTime"));
        table.setItems(observableList);
    }

    @FXML
    Button backHomeBtn, studentBtn, demoBtn;
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
    public void handleStudentBtn() throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("studentView.fxml")));
        Stage window = (Stage) studentBtn.getScene().getWindow();
        window.setResizable(false);
        window.setScene(new Scene(root, 650  , 433));
    }
}