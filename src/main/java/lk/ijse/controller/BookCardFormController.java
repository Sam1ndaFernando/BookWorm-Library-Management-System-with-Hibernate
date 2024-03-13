package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BookCardFormController {

    @FXML
    private JFXButton btnReturn;

    @FXML
    private Label lblBookname;

    @FXML
    private Label lblBorrowDate;

    @FXML
    private Label lblDueDate;

    @FXML
    private Label lblCategory;

    @FXML
    void btnReturnOnAction(ActionEvent event) {

    }

}
