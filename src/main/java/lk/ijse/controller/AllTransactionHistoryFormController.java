package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AllTransactionHistoryFormController {

    @FXML
    private AnchorPane root;

    @FXML
    private ComboBox<?> combType;

    @FXML
    private TableView<?> tblTransaction;

    @FXML
    private TableColumn<?, ?> colTransactionId;

    @FXML
    private TableColumn<?, ?> ColBookId;

    @FXML
    private TableColumn<?, ?> ColBookName;

    @FXML
    private TableColumn<?, ?> colUserId;

    @FXML
    private TableColumn<?, ?> colBranchId;

    @FXML
    private TableColumn<?, ?> colType;

    @FXML
    private TableColumn<?, ?> colDate;

    @FXML
    private TextField txtSearch;

    @FXML
    private JFXButton btnOverdue;

    @FXML
    void btnOverdueAction(ActionEvent event) {

    }

    @FXML
    void combTypeOnAction(ActionEvent event) {

    }

    @FXML
    void txtSearchOnAction(ActionEvent event) {

    }

}
