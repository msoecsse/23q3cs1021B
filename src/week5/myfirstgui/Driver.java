package week5.myfirstgui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Driver extends Application {

    public void start(Stage primaryStage){

        Label label = new Label("That's a button!");
        Button button = new Button("Click me!");

        label.setAlignment(Pos.CENTER);
        button.setAlignment(Pos.CENTER);

        button.setFont(Font.font("Comic Sans MS"));


        Pane box = new FlowPane();
        box.getChildren().addAll(label,button);

        //Parent mom = button;

        Scene scene = new Scene(box);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args){
        launch(args);
    }

}
