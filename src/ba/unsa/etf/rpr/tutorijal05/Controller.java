package ba.unsa.etf.rpr.tutorijal05;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public Label display;
    private String result="0";
    private String operand="";
    private String operator="";

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        display.setText("0");
    }

    public void zero(ActionEvent actionEvent) {
        if(!operand.equals("")){
            operand+="0";
            display.setText(operand);
        }
    }

    public void one(ActionEvent actionEvent) {
        operand+="1";
        display.setText(operand);
    }

    public void nine(ActionEvent actionEvent) {
        operand+="9";
        display.setText(operand);
    }


    public void seven(ActionEvent actionEvent) {
        operand+="7";
        display.setText(operand);
    }

    public void six(ActionEvent actionEvent) {
        operand+="6";
        display.setText(operand);
    }

    public void three(ActionEvent actionEvent) {
        operand+="3";
        display.setText(operand);
    }

    public void five(ActionEvent actionEvent) {
        operand+="5";
        display.setText(operand);
    }

    public void four(ActionEvent actionEvent) {
        operand+="4";
        display.setText(operand);
    }

    public void eight(ActionEvent actionEvent) {
        operand+="8";
        display.setText(operand);
    }

    public void two(ActionEvent actionEvent) {
        operand+="2";
        display.setText(operand);
    }

    public void plus(ActionEvent actionEvent) {
            Double a,b;
            a=Double.parseDouble(result);
            b=Double.parseDouble(operand);
            a+=b;
            result=a.toString();
            operand="";
            display.setText("0");
            operator="+";
    }

    public void minus(ActionEvent actionEvent) {
        if(operand.equals("")){
            operand+="-0";
            display.setText(operand);
        }else{
            Double a,b;
            a=Double.parseDouble(result);
            b=Double.parseDouble(operand);
            a-=b;
            result=a.toString();
            operand="";
            display.setText("0");
            operator="-";
        }
    }

    public void divide(ActionEvent actionEvent) {
    }

    public void mod(ActionEvent actionEvent) {
    }

    public void times(ActionEvent actionEvent) {
    }

    public void dot(ActionEvent actionEvent) {
        String temp=operand;
        if(!operand.contains(".")){
            operand+=".";
            display.setText(operand);
        }
    }

    public void equals(ActionEvent actionEvent) {
        Double a,b;
        a=Double.parseDouble(result);
        result="0";
        b=Double.parseDouble(operand);
        operand="";
        if(operator.equals("+")){
            a+=b;
            display.setText(a.toString());
        }
    }
}
