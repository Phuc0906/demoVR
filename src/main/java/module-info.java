module com.example.demovr {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demovr to javafx.fxml;
    exports com.example.demovr;
}