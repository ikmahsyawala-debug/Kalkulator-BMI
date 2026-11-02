package main;

import java.util.Scanner;
import model.Bmi;

public class DemoTerminalMode {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("   DEMO TERMINAL KALKULATOR BMI");
        System.out.println("==================================");

        try {
            System.out.println("Pilih jenis kelamin:");
            System.out.println("1. Laki-laki");
            System.out.println("2. Perempuan");
            System.out.print("Pilihan (1/2): ");
            String pilihan = input.nextLine().trim();

            if (!pilihan.equals("1") && !pilihan.equals("2")) {
                System.out.println("Pilihan tidak valid!");
                return;
            }

            System.out.print("Masukkan berat badan (kg): ");
            double berat = Double.parseDouble(
                    input.nextLine().trim().replace(',', '.')
            );

            System.out.print("Masukkan tinggi badan (cm): ");
            double tinggi = Double.parseDouble(
                    input.nextLine().trim().replace(',', '.')
            );

            Bmi bmi = new Bmi(berat, tinggi);

            System.out.printf("Nilai BMI : %.2f%n", bmi.hitungBMI());
            System.out.println("Jenis kelamin: "
                    + (pilihan.equals("1") ? "Laki-laki" : "Perempuan"));
            System.out.println("Kategori: " + bmi.kategoriBMI());

        } catch (NumberFormatException e) {
            System.out.println("Input harus berupa angka!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            input.close();
        }
    }
}
