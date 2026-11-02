package controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Bmi;

public class BmiController {

    @FXML
    private TextField txtTinggi;

    @FXML
    private TextField txtBerat;

    @FXML
    private ComboBox<String> cbJenisKelamin;

    @FXML
    private Label lblHasil;

    @FXML
    public void initialize() {
        cbJenisKelamin.getItems().addAll(
                "Laki-laki",
                "Perempuan"
        );
    }

    @FXML
    private void hitungBMI() {
        try {
            double tinggi = Double.parseDouble(
                    txtTinggi.getText().trim().replace(',', '.')
            );

            double berat = Double.parseDouble(
                    txtBerat.getText().trim().replace(',', '.')
            );

            Bmi bmi = new Bmi(berat, tinggi);

            lblHasil.setText(
                    String.format(
                            java.util.Locale.US,
                            "BMI: %.2f\nKategori: %s",
                            bmi.hitungBMI(),
                            bmi.kategoriBMI()
                    )
            );

        } catch (NumberFormatException e) {
            lblHasil.setText(
                    "Masukkan tinggi dan berat dengan benar."
            );

        } catch (IllegalArgumentException e) {
            lblHasil.setText(e.getMessage());
        }
    }

    @FXML
    private void resetForm() {
        txtTinggi.clear();
        txtBerat.clear();
        cbJenisKelamin.getSelectionModel().clearSelection();
        lblHasil.setText("Hasil BMI akan muncul di sini");
    }
}
