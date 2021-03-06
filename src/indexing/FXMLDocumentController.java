/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indexing;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Model;

/**
 *
 * @author Balea Cristian
 */
public class FXMLDocumentController implements Initializable {

    ResultSet rs = null;
    PreparedStatement pst = null;

    // taxt fields
    @FXML
    private TextField txtKitchenCold;
    @FXML
    private TextField txtKitchenHot;
    @FXML
    private TextField txtBathCold;
    @FXML
    private TextField txtBathHot;

    // table views
    @FXML
    private TableView table2014;
    @FXML
    private TableView table2015;
    @FXML
    private TableView table2016;

    // combo boxes
    @FXML
    private ComboBox dropDownYear;
    @FXML
    private ComboBox dropDownMonth;

    // buttons
    @FXML
    private Button btnKitchenIndex;
    @FXML
    private Button btnBathIndex;

    // observable lists
    ObservableList<Integer> dropDownYears;
    ObservableList<String> dropDownMonths;

    @FXML
    private void handleButtonAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        Model model = new Model();
        dropDownYears = FXCollections.observableArrayList(model.getYears());
        dropDownMonths = FXCollections.observableArrayList(model.getMonths());
        dropDownYear.setItems(dropDownYears);
        dropDownMonth.setItems(dropDownMonths);
    }

}
