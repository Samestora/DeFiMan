package com.defiman;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.sql.*;

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
    void signupaction(MouseEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("fxml/signup.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
