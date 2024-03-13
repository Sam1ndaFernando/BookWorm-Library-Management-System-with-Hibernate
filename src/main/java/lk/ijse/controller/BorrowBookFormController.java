package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class BorrowBookFormController {

    @FXML
    private TableView<?> tblBook;

    @FXML
    private TableColumn<?, ?> colBookTitle;

    @FXML
    private TableColumn<?, ?> colAuthor;

    @FXML
    private TableColumn<?, ?> colGener;

    @FXML
    private TableColumn<?, ?> colBtnGet;

    @FXML
    private TextField txtSEarch;

    @FXML
    private ImageView img1;

    @FXML
    private TextField txtBookTitle;

    @FXML
    private TextField txtAuthor;

    @FXML
    private TextField txtGener;

    @FXML
    private ComboBox<?> combPeriod;

    @FXML
    private Label lblDueDate;

    @FXML
    private JFXButton btnBorrow;

    @FXML
    void btnBorrowOnAction(ActionEvent event) {

    }

    @FXML
    void combPeriodOnAction(ActionEvent event) {

    }

    @FXML
    void txtSearch(ActionEvent event) {

    }

}
