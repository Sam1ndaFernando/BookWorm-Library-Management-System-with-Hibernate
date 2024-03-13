package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class UnreturnedBookFormController {

    @FXML
    private TableView<?> tblOverdueBooks;

    @FXML
    private TableColumn<?, ?> colEmail;

    @FXML
    private TableColumn<?, ?> colBook;

    @FXML
    private TableColumn<?, ?> colDate;

    @FXML
    private TableColumn<?, ?> colOverdueDays;

    @FXML
    private ComboBox<?> cmbBranch;

    @FXML
    void cmbBranchOnActions(ActionEvent event) {

    }

}
