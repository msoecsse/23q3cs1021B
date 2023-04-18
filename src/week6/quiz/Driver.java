package week6.quiz;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Driver extends Application {
    private Button calculate;
    private TextField value1;
    private TextField value2;
    private TextField result;

    @Override
    public void start(Stage stage){

        calculate = new Button("Calculate");
        value1 = new TextField("");
        value2 = new TextField("");
        result = new TextField("");

        VBox vbox = new VBox();
        StackPane pane = new StackPane();

        vbox.getChildren().addAll(calculate,value1,value2,result);
        pane.getChildren().addAll(vbox);

        calculate.setOnAction(this::addNumbers);

        Scene scene = new Scene(pane,300,300);

        stage.setScene(scene);
        stage.show();
    }

    private void addNumbers(ActionEvent e){

        result.setText((Double.parseDouble(value1.getText()) + Double.parseDouble(value2.getText())) + "");

    }




}
