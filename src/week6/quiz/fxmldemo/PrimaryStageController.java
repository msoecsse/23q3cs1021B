package week6.quiz.fxmldemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryStageController {

    @FXML
    protected Button demoButton;

    @FXML
    protected TextField foobar;

    protected void handle(ActionEvent e){
        demoButton.setRotate(demoButton.getRotate() + 30);
    }

}
