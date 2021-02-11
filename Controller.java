package sample;
import javafx.application.Application;

import java.io.IOException;
import java.util.Scanner;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import sample.SecondController;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Button ClickMeBtn;
    @FXML
    private TextField textfield;



    @FXML
    private void pressClickMeButton(ActionEvent event) {



        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Hello_World.fxml"));
            Parent root = (Parent) loader.load();
            SecondController setController= loader.getController();
            setController.myFunction(textfield.getText());
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }





        }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

