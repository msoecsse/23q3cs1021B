package week5.clickme;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ButtonHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event) {
        Button button = (Button)event.getSource();
        button.setRotate(30 + button.getRotate());
    }
}
