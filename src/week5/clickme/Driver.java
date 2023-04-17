package week5.clickme;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class Driver extends Application {

    public void start(Stage primaryStage){

        Button button = new Button("Click me!");
        Label label = new Label("Hello there");

        //Separate class reference
        //ButtonHandler handler = new ButtonHandler();

        //Inner class reference
        //ButtonHandler2 handler = new ButtonHandler2();

        //registration with EventHandler reference variable
        //button.setOnAction(handler);

        //registration with Anonymous inner class
//        button.setOnAction(new EventHandler<ActionEvent>(){
//            public void handle(ActionEvent event) {
//                Button button = (Button)event.getSource();
//
//                if(button.getFont().equals(Font.font("Comic Sans MS"))){
//                    button.setFont(Font.font("Papyrus"));
//                }else{
//                    button.setFont(Font.font("Comic Sans MS"));
//                }
//
//            }
//        });

        //registration with lambda functions
//        button.setOnAction(e -> {
//            button.setTranslateX(Math.random() * 150);
//            button.setTranslateY(Math.random() * 150);
//        });

        //registration with lamda function and a separate method
        //button.setOnAction(e -> foobar(e));

        //method reference
        button.setOnMouseMoved(this::foobar);


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

    public void foobar(MouseEvent event) {
        Button button = (Button)event.getSource();
        button.setRotate(30 + button.getRotate());

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
