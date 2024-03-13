package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class AdminDashboardFormController {

    @FXML
    private AnchorPane root;

    @FXML
    private AnchorPane pane2;

    @FXML
    private TableView<?> tblCheckOuts;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colBookName;

    @FXML
    private TableColumn<?, ?> colDueDate;

    @FXML
    private Label lblBook;

    @FXML
    private Label lblUser;

    @FXML
    private JFXButton btnBook;

    @FXML
    private JFXButton Dashboard;

    @FXML
    private JFXButton btnBranches;

    @FXML
    private JFXButton btnTransaction;

    @FXML
    private ImageView imgExit;

    @FXML
    private ImageView imgProfile;

    @FXML
    void btnBookOnAction(ActionEvent event) {

    }

    @FXML
    void btnBranchesOnAction(ActionEvent event) {

    }

    @FXML
    void btnTransactionOnAction(ActionEvent event) {

    }

    @FXML
    void dashboardOnAction(ActionEvent event) {

    }

    @FXML
    void imgExitOnAction(MouseEvent event) {

    }

    @FXML
    void imgProfileOnAction(MouseEvent event) {

    }

}
