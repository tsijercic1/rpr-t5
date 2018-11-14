package ba.unsa.etf.rpr.tutorijal05;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public Label display;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        display.setText("0");
    }
}
