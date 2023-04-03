package com.example.lab2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class HelloController {
    public RadioButton nieb_info;
    public RadioButton ziel_info;
    public RadioButton czerw_info;
    public RadioButton button1;
    public RadioButton button2;
    public RadioButton button3;
    public ImageView obrazek;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


    @FXML
    private void kolor_nieb() {
        nieb_info.setTextFill(Color.BLUE);
    }

    private void kolor_ziel() {
        ziel_info.setTextFill(Color.GREEN);
    }

    private void kolor_czerw() {
        czerw_info.setTextFill(Color.RED);
    }

    private void set1() {
        button1.setText("1");
    }

    private void set2() {
        button1.setText("2");
    }

    private void set3() {
        button1.setText("3");
    }

    private void show_calendar() {
        obrazek.setImage(new Image(getClass().getResourceAsStream("Calendar.jpg")));
    }
}