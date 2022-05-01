module tables.coursestables {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jetbrains.annotations;
    requires com.jfoenix;
    requires java.sql;
    opens tables.coursestables to javafx.fxml;
    exports tables.coursestables;
}