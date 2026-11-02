package model;

public class Bmi {

    private final double berat;
    private final double tinggi;

    public Bmi(double berat, double tinggi) {
        if (berat <= 0 || tinggi <= 0) {
            throw new IllegalArgumentException(
                    "Berat dan tinggi harus lebih dari nol."
            );
        }

        this.berat = berat;
        this.tinggi = tinggi;
    }

    public double hitungBMI() {
        double tinggiMeter = tinggi / 100.0;
        return berat / (tinggiMeter * tinggiMeter);
    }

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
