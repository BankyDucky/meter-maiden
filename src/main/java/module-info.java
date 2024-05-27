module com.example.metermaiden {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.metermaiden to javafx.fxml;
    exports com.example.metermaiden;
}