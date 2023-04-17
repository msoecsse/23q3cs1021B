package week5.anotherexample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HappyBirthday extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Label label = new Label("Hello - what is your name?");
        Button clickMe = new Button("Do it!");
        TextField textField = new TextField("");

        clickMe.setOnAction( e -> {
            label.setText("Hello " + textField.getText());
        });

        textField.setOnAction( e -> {
            label.setText("Hello " + textField.getText());
            textField.setText("");
        });


        Pane box = new VBox();
        box.getChildren().addAll(label,textField,clickMe);

        Scene scene = new Scene(box,300,300);

        stage.setScene(scene);

        stage.show();

    }

}
