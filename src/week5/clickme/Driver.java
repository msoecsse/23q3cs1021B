package week5.clickme;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Driver extends Application {

    public void start(Stage primaryStage){

        Button button = new Button("Click me!");

        //Separate lass reference
        //ButtonHandler handler = new ButtonHandler();

        //Inner class reference
        ButtonHandler2 handler = new ButtonHandler2();

        //registration with EventHandler reference variable
        button.setOnAction(handler);


        button.setAlignment(Pos.CENTER);

        button.setFont(Font.font("Comic Sans MS"));


        Pane box = new StackPane();
        box.getChildren().addAll(button);

        //Parent mom = button;

        Scene scene = new Scene(box, 300,300);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args){
        launch(args);
    }

    public void fubar(ActionEvent event) {
        Button button = (Button)event.getSource();

        if(button.getFont().equals(Font.font("Comic Sans MS"))){
            button.setFont(Font.font("Papyrus"));
        }else{
            button.setFont(Font.font("Comic Sans MS"));
        }

    }

    private class ButtonHandler2 implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            Button button = (Button)event.getSource();

            if(button.getFont().equals(Font.font("Comic Sans MS"))){
                button.setFont(Font.font("Papyrus"));
            }else{
                button.setFont(Font.font("Comic Sans MS"));
            }

        }
    }

}
