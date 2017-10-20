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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author MirzaUY
 */
public class LaundryController implements Initializable {

    @FXML
    private TextField nama;
    @FXML
    private TextField alamat;
    @FXML
    private TextField berat;
    @FXML
    private TextField telp;
    @FXML
    private ToggleGroup pilihan;
    @FXML
    private TextField tanggal;
    @FXML
    private TextArea hasil;
    @FXML
    private Button oke;
    @FXML
    private Button hapus;
    @FXML
    private RadioButton rdS;
    @FXML
    private RadioButton rdCK;
    @FXML
    private RadioButton rdCKS;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
        String nm,almt,tgl,telpon;
        String paket = "";
        int brt,harga=0;
        nm = nama.getText();
        almt = alamat.getText();
        tgl = tanggal.getText();
        telpon = telp.getText();
        brt = Integer.parseInt(berat.getText());
        if(rdS.isSelected()){
        paket="Setrika";
        harga = brt*5000;
        }else if(rdCK.isSelected()){
        paket = "Cuci Kering";
        harga = brt*8000;
        }else if(rdCKS.isSelected()){
        paket = "Cuci Kering Setrika";
        harga = brt*10000;
        }else{
        paket="";
        }
        
        hasil.setText(" Nama : " +nm+ "\n Alamat : " +almt+ "\n Berat : "
                +brt+ " kg" +"\n Nomor Telepon : "+telpon+"\n Pilihan Paket : "
                +paket+"\n Tanggal Pengambilan : "+tgl+"\n Pembayaran yang Harus dibayar : Rp. "+harga);
        
    }

    @FXML
    private void hapus(ActionEvent event) {
        nama.setText("");
        alamat.setText("");
        telp.setText("");
        tanggal.setText("");
        berat.setText("");
        hasil.setText("");
        rdS.setSelected(false);
        rdCK.setSelected(false);
        rdCKS.setSelected(false);
        
    }
    
}
