module com.mat.metermaven {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mat.metermaiden to javafx.fxml;

    exports com.mat.metermaiden;
    exports com.mat.metermaiden.Controllers;
//    exports com.mat.metermaiden.Models;
//    exports com.mat.metermaiden.Views;

    opens com.mat.metermaiden.Controllers to javafx.fxml;
}