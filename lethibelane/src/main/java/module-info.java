module com.example.lethibelane {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.lethibelane to javafx.fxml;
    exports com.example.lethibelane;
}