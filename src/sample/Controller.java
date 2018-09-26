package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.awt.*;

public class Controller {
    @FXML

    boolean flag = true;
    @FXML
    Button b1;
    @FXML
    Button b2;
    @FXML
    Button b3;
    @FXML
    Button b4;
    @FXML
    Button b5;
    @FXML
    Button b6;
    @FXML
    Button b7;
    @FXML
    Button b8;
    @FXML
    Button b9;
    @FXML
    Label lb;

    public void OOXX(ActionEvent e) {
        Button tmp = (Button) e.getSource();
        if (tmp.getText().equals("")) {
            if (flag) {
                tmp.setText("O");
            } else {
                tmp.setText("X");
            }
            flag = !flag;
        }

        if (b1.getText().equals(b2.getText()) && b1.getText().equals(b3.getText()) && !b1.getText().equals("")) {
        lb.setText(b1.getText()+"win");}
        if (b4.getText().equals(b5.getText()) && b4.getText().equals(b6.getText()) && !b4.getText().equals("")) {
        lb.setText(b4.getText()+"win");}
        if (b7.getText().equals(b8.getText()) && b7.getText().equals(b9.getText()) && !b7.getText().equals("")) {
        lb.setText(b7.getText()+"win");}
        if (b1.getText().equals(b4.getText()) && b1.getText().equals(b7.getText()) && !b1.getText().equals("")) {
        lb.setText(b1.getText()+"win");}
        if (b2.getText().equals(b5.getText()) && b2.getText().equals(b8.getText()) && !b2.getText().equals("")) {
        lb.setText(b2.getText()+"win");}
        if (b3.getText().equals(b6.getText()) && b3.getText().equals(b9.getText()) && !b3.getText().equals("")) {
        lb.setText(b1.getText()+"win");}
        if (b1.getText().equals(b5.getText()) && b1.getText().equals(b9.getText()) && !b1.getText().equals("")) {
        lb.setText(b1.getText()+"win");}
        if (b3.getText().equals(b5.getText()) && b3.getText().equals(b7.getText()) && !b3.getText().equals("")) {
        lb.setText(b3.getText()+"win");}

    }
}
