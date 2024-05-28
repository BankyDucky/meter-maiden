package com.mat.metermaiden;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomeApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/FXML/Startpage.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Meter Maiden");
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            e.printStackTrace();
            System.exit(-1);
        }
    }

    public static void main(String[] args){
        launch(args);
    }
}
