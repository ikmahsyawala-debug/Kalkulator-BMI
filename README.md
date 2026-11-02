
# Kalkulator BMI

Aplikasi Kalkulator Body Mass Index (BMI) berbasis Java dengan menggunakan JavaFX sebagai Graphical User Interface (GUI). Aplikasi ini digunakan untuk menghitung nilai BMI berdasarkan tinggi dan berat badan serta menampilkan kategori hasil perhitungan.

## Fitur Aplikasi

- Input tinggi badan (cm).
- Input berat badan (kg).
- Pilihan jenis kelamin (laki-laki dan perempuan).
- Menghitung nilai BMI secara otomatis.
- Menampilkan hasil dan kategori BMI.
- Tombol Reset untuk menghapus input dan hasil perhitungan.
- Validasi input pengguna.

## Tampilan Aplikasi

![Tampilan Kalkulator BMI](screenshot/Tampilan-Aplikasi.png)

## Teknologi yang Digunakan

- Java 24
- JavaFX 24.0.2
- Maven
- Scene Builder
- NetBeans IDE

## Struktur Project

```text
kalkulatorBMI/
├── src/
│   └── main/
│       ├── java/
│       │   ├── com/mycompany/kalkulatorbmi/
│       │   ├── controller/
│       │   │   └── BmiController.java
│       │   ├── main/
│       │   │   ├── MainApp.java
│       │   │   └── DemoTerminalMode.java
│       │   └── model/
│       │       ├── Bmi.java
│       │       ├── BmiPria.java
│       │       └── BmiWanita.java
│       └── resources/
│           └── kalkulatorBmi.fxml
├── screenshots/
│   └── kalkulator-bmi.png
└── pom.xml
```

## Persyaratan

Sebelum menjalankan aplikasi, pastikan sudah menginstal:

1. JDK 24
2. Apache Maven
3. NetBeans IDE (opsional)

## Cara Menjalankan Aplikasi

### 1. Clone Repository

Buka terminal atau Command Prompt, kemudian jalankan:

```bash
git clone https://github.com/USERNAME/kalkulatorBMI.git
```

Ganti `USERNAME` dengan username GitHub pemilik repository.

### 2. Masuk ke Folder Project

```bash
cd kalkulatorBMI
```

### 3. Jalankan Aplikasi

Jalankan perintah berikut:

```bash
mvn clean javafx:run
```

Tunggu hingga proses build selesai dan aplikasi Kalkulator BMI terbuka.

### 4. Menjalankan melalui NetBeans

1. Buka NetBeans IDE.
2. Pilih File → Open Project.
3. Pilih folder project kalkulatorBMI.
4. Tunggu Maven memuat seluruh dependency.
5. Jalankan project menggunakan goal `javafx:run`.

## Rumus Perhitungan BMI

BMI dihitung menggunakan rumus:

**BMI = Berat Badan (kg) / Tinggi Badan (m)²**

Tinggi badan dalam sentimeter dikonversi terlebih dahulu menjadi meter.

### Kategori BMI Dewasa

| Nilai BMI | Kategori |
|---|---|
| < 18,5 | Berat badan kurang |
| 18,5 – < 25 | Berat badan normal |
| 25 – < 30 | Berat badan berlebih |
| ≥ 30 | Obesitas |

*Catatan: Kategori ini merupakan acuan sederhana untuk orang dewasa, bukan untuk interpretasi BMI anak dan remaja.*

## Konsep Pemrograman

Aplikasi ini menggunakan konsep Model-View-Controller (MVC):

- **Model:** Mengelola proses perhitungan BMI dan penentuan kategori.
- **View:** Menampilkan antarmuka aplikasi menggunakan JavaFX dan FXML.
- **Controller:** Menghubungkan tampilan dengan proses perhitungan serta mengelola interaksi pengguna.

## Author

Dikembangkan sebagai project pembelajaran Java dan JavaFX.
