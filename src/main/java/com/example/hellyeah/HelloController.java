package com.example.hellyeah;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class HelloController {
    @FXML
    public Label welcomeText, stats;
    public Object btnSignIn;
    public TextField txtfieldUsername, txtfieldPassword;
    public ColorPicker cpPicker;

    @FXML
    private AnchorPane LoginPage;

    @FXML
    private AnchorPane LogoutPage;
    @FXML
    protected void onHelloButtonClick() throws IOException {
        String username = "skyflakes02";
        String password = "feligwapa1";

        if(txtfieldUsername.getText().equals(username) && txtfieldPassword.getText().equals(password)){
            AnchorPane p = (AnchorPane) LoginPage.getParent();
            p.getScene().getStylesheets().clear();
            p.getStylesheets().add(getClass().getResource("user1.css").toExternalForm());
            Parent scene = FXMLLoader.load(HelloApplication.class.getResource("homeview.fxml"));
            p.getChildren().clear();
            p.getChildren().add(scene);
        }


        if(txtfieldUsername.getText().isEmpty() || txtfieldPassword.getText().isEmpty()){
            stats.setText("Complete all fields.");
        }else{
            Parent scene = FXMLLoader.load(HelloApplication.class.getResource("homeview.fxml"));
            LoginPage.getChildren().clear();
            LoginPage.getChildren().add(scene);
        }

    }


    @FXML
    void onLogoutClick() throws IOException {
        Parent scene = FXMLLoader.load(HelloApplication.class.getResource("hello-view.fxml"));
        LogoutPage.getChildren().clear();
        LogoutPage.getChildren().add(scene);

    }
}