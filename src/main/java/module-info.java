module com.workes {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.workes to javafx.fxml;
    exports com.workes;
}
