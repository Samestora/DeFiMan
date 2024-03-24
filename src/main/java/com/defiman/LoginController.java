package com.defiman;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private Label forgotbutton;

    @FXML
    private Label exitbutton;

    @FXML
    private Label signupbutton;

    @FXML
    private Button loginbutton;

    @FXML
    private PasswordField passwordfield;

    @FXML
    private TextField userfield;
    
    @FXML
    void exitaction(MouseEvent event) {
        Stage stage = (Stage) exitbutton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void forgotpasswordaction(MouseEvent event) {

    }

    @FXML
    void signupaction(MouseEvent event) {

    }

}
