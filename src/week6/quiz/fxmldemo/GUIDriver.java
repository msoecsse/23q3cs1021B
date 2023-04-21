package week6.quiz.fxmldemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GUIDriver extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader primaryLoader = new FXMLLoader(GUIDriver.class.getResource("view.fxml"));
        Scene scene = new Scene(primaryLoader.load());

        stage.setScene(scene);
        stage.show();


    }
}
