/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyoba;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author MirzaUY
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField nama;
    @FXML
    private TextField absen;
    @FXML
    private TextField alamat;
    @FXML
    private TextArea hasil;
    @FXML
    private Button oke;
    
    
    @FXML
    private void button(ActionEvent event) {
        String nm,abs,almt;
        nm = nama.getText();
        abs = absen.getText();
        almt = alamat.getText();
        hasil.setText("Nama Siswa = " + nm+"\nAbsen Siswa = "+abs+"\nAlamat Siswa = "+almt);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
