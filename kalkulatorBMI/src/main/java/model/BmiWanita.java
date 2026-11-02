package model;

public class BmiWanita extends Bmi {

    public BmiWanita(double berat, double tinggi) {
        super(berat, tinggi);
    }

    @Override
    public String kategoriBMI() {
        double bmi = hitungBMI();

        if (bmi < 18.5) {
            return "Berat badan kurang";
        } else if (bmi < 25) {
            return "Berat badan normal";
        } else if (bmi < 30) {
            return "Berat badan berlebih";
        } else {
            return "Obesitas";
        }
    }
}
