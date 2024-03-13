package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class UserRegisterFormController {

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtPwd;

    @FXML
    private JFXButton btnCreateAccount;

    @FXML
    private ComboBox<?> cmbBranch;

    @FXML
    void btnCreateAccountOnAction(ActionEvent event) {

    }

}
