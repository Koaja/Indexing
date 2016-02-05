/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indexing;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author Balea Cristian
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField txtKitchenCold;
    @FXML
    private TextField txtKitchenHot;
    @FXML
    private TextField txtBathCold;
    @FXML
    private TextField txtBathHot;

    @FXML
    private ListView list2014;
    @FXML
    private ListView list2015;
    @FXML
    private ListView list2016;

    @FXML
    private Button btnKitchenIndex;
    @FXML
    private Button btnBathIndex;

    @FXML

    private void handleButtonAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
