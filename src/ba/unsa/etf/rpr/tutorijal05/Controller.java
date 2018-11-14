package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
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
    private SimpleStringProperty resProp;

    public Controller(){
        resProp = new SimpleStringProperty();
    }

    public SimpleStringProperty resPropProperty(){
        return resProp;
    }

    public String getResProp(){
        return resProp.get();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        resProp.set("0");
    }

    public void zero(ActionEvent actionEvent) {
        if(!operand.equals("")){
            operand+="0";
            resProp.set(operand);
        }
    }

    public void one(ActionEvent actionEvent) {
        operand+="1";
        resProp.set(operand);
    }

    public void nine(ActionEvent actionEvent) {
        operand+="9";
        resProp.set(operand);
    }


    public void seven(ActionEvent actionEvent) {
        operand+="7";
        resProp.set(operand);
    }

    public void six(ActionEvent actionEvent) {
        operand+="6";
        resProp.set(operand);
    }

    public void three(ActionEvent actionEvent) {
        operand+="3";
        resProp.set(operand);
    }

    public void five(ActionEvent actionEvent) {
        operand+="5";
        resProp.set(operand);
    }

    public void four(ActionEvent actionEvent) {
        operand+="4";
        resProp.set(operand);
    }

    public void eight(ActionEvent actionEvent) {
        operand+="8";
        resProp.set(operand);
    }

    public void two(ActionEvent actionEvent) {
        operand+="2";
        resProp.set(operand);
    }

    public void plus(ActionEvent actionEvent) {
            Double a,b;
            a=Double.parseDouble(result);
            b=Double.parseDouble(operand);
            a+=b;
            result=a.toString();
            operand="";
            resProp.set("0");
            operator="+";
    }

    public void minus(ActionEvent actionEvent) {
        //System.out.println("Result: "+result);
        //System.out.println("Operand: "+operand);
        if(operand.equals("")){
            operand+="-";
            resProp.set(operand);
        }else{
            Double a,b;
            a=Double.parseDouble(result);
            b=Double.parseDouble(operand);
            a+=b;
            result=a.toString();
            operand="";
            resProp.set("0");
            operator="-";
        }
    }

    public void divide(ActionEvent actionEvent) {
        operator="/";
        result=operand;
        operand="";
    }

    public void mod(ActionEvent actionEvent) {
        operator="%";
        result=operand;
        operand="";
    }

    public void times(ActionEvent actionEvent) {
        operator="x";
        result=operand;
        operand="";
    }

    public void dot(ActionEvent actionEvent) {
        //String temp=operand;
        if(!operand.contains(".")){
            operand+=".";
            resProp.set(operand);
        }
    }

    public void equals(ActionEvent actionEvent) {
        System.out.println("Result: "+result);
        System.out.println("Operand: "+operand);
        Double a,b;
        a=Double.parseDouble(result);
        result="0";
        b=Double.parseDouble(operand);
        operand="";
        switch (operator){
            case "+":
                a+=b;
                resProp.set(a.toString());
                break;
            case "-":
                a-=b;
                resProp.set(a.toString());
                break;
            case "x":
                a*=b;
                resProp.set(a.toString());
                break;
            case "/":
                a/=b;
                resProp.set(a.toString());
                break;
            case "%":
                a%=b;
                resProp.set(a.toString());
                break;

        }
        if(operator.equals("+")){
        }
    }
}
