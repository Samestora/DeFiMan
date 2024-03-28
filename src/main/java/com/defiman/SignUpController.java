package com.defiman;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class SignUpController {

    @FXML
    private Label exitbutton;

    @FXML
    private PasswordField passwordfield;

    @FXML
    private Label signinbutton;

    @FXML
    private Button signupbutton;

    @FXML
    private TextField userfield;

    // Window draggable

    private double xOffset = 0;
    private double yOffset = 0;

    @FXML
    private HBox rootHBox;

    @FXML
    private void initialize() {
        // Set up event handlers for mouse press and drag
        rootHBox.setOnMousePressed(this::onMousePressed);
        rootHBox.setOnMouseDragged(this::onMouseDragged);
    }

    private void onMousePressed(MouseEvent event) {
        xOffset = event.getSceneX();
        yOffset = event.getSceneY();
    }

    private void onMouseDragged(MouseEvent event) {
        Stage stage = (Stage) rootHBox.getScene().getWindow();
        stage.setX(event.getScreenX() - xOffset);
        stage.setY(event.getScreenY() - yOffset);
    }

    // All Actions
    @FXML
    void exitaction(MouseEvent event) throws IOException{
        Stage stage = (Stage) exitbutton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void tosignin(MouseEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("fxml/signin.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void tosignup(MouseEvent event) {
        
    }
    
}
