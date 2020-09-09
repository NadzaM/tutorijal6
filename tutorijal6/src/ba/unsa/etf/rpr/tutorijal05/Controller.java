package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    public Label display;
    public Button jednakoBtn;

    public void setNumber(String number) {
        this.number.set(number);
    }

    private SimpleStringProperty number;
    int p = 1;
    boolean decimala = false;
    public Controller() {
        number = new SimpleStringProperty("0");
    }

    public String getNumber() {
        return number.get();
    }

    public SimpleStringProperty numberProperty() {
        return number;
    }

    public void action0(ActionEvent actionEvent) {
        number.set("0");
        if (decimala) p = p / 10;
        else p = p*10;
    }

    public void action1(ActionEvent actionEvent) {
        number.set("1");
        if (decimala) p = p / 10;
        else p = p*10;
    }

    public void action2(ActionEvent actionEvent) {
    }

    public void action3(ActionEvent actionEvent) {
    }

    public void action4(ActionEvent actionEvent) {
    }

    public void action5(ActionEvent actionEvent) {
    }

    public void action6(ActionEvent actionEvent) {
    }

    public void action7(ActionEvent actionEvent) {
    }

    public void action8(ActionEvent actionEvent) {
    }

    public void action9(ActionEvent actionEvent) {
    }

    public void actionplus(ActionEvent actionEvent) {
    }

    public void actionjednako(ActionEvent actionEvent) {
    }
}
