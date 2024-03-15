module com.example.hellyeah {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hellyeah to javafx.fxml;
    exports com.example.hellyeah;
}