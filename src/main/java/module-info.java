module com.example.seguimiento14javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.seguimiento14javafx to javafx.fxml;
    exports com.example.seguimiento14javafx;
}