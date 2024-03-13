package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AdminLoginFormController {

    @FXML
    private AnchorPane root;

    @FXML
    private TextField txtUserName;

    @FXML
    private TextField showTextPw;

    @FXML
    private PasswordField hiddenTxtPassword;

    @FXML
    private CheckBox checkBoxPw;

    @FXML
    private JFXButton btnLogIn;

    @FXML
    void btnLogInOnAction(ActionEvent event) {

    }

    @FXML
    void checkBoxPwOnAction(ActionEvent event) {

    }

}
