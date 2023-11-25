/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itbs.praktik;

/**
 *
 * @author Agung Prasetyo
 */
public class Latihan {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World Latihan");

        System.out.println(3);
        System.out.println(3 + 4); // penjumlahan
        System.out.println(10 - 4); // pengurangan
        System.out.println(10 * 4); // perkalian
        System.out.println(10 / 2); // pembagian
        System.out.println(5 % 2); // mod
        System.out.println("4 + 4"); // tidak ada aksi penjumlahan karena type string

        int angka;
        angka = 10;
        System.out.println(angka);

        String nama;
        nama = "Yada";
        System.out.println(nama);

        int angka2 = 10;
        System.out.println(angka2 + 2);

        int angka3 = 10;
        System.out.println(angka2 + angka3);

        String greeting = "Halo ";
        System.out.println(greeting + "Yada");

        String name2 = "Yada";
        System.out.println(greeting + name2);

        String name3 = "Yada";
        System.out.println(name3);

        name3 = "Prasetyo";
        System.out.println(name3);

        int x = 3;
        System.out.println(x);

        x = x + 3;
        System.out.println(x);

        x += 10; // x = x + 10;
        System.out.println(x);
        x -= 10; // x = x - 10;
        System.out.println(x);
        x *= 10; // x = x * 10;
        System.out.println(x);
        x /= 10; // x = x / 10;
        System.out.println(x);
        x %= 10; // x = x % 10;
        System.out.println(x);

        x++; // x = x + 1 atau x += 1
        System.out.println(x);
        x--; // x = x - 1 atau x -= 1
        System.out.println(x);

        double number = 5.24;
        System.out.println(number);

        double number1 = 8.5;
        double number2 = 3.4;

        System.out.println(number1 + number2);
        System.out.println(number1 - number2);

        System.out.println("Saya berusia " + 25 + " tahun");

        System.out.println(5 / 2); // output int
        System.out.println(5.0 / 2.0); // output double

        // projek akhir
        String name = "Kate John";
        int umur = 27;
        double tinggiBadan = 1.6;
        double beratBadan = 50.0;
        double bmi = 50.0 / (1.6 * 1.6);

        System.out.println("Nama Saya adalah " + name);
        System.out.println("Saya berusia " + umur + " tahun");
        System.out.println("Tinggi Saya adalah " + tinggiBadan + " meter");
        System.out.println("Berat Saya adalah " + beratBadan + " kilogram");
        System.out.println("BMI saya adalah " + bmi);

    }

}
