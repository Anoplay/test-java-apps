/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itbs.praktik;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author agung
 */
public class Latihan2 {

    public static void main(String[] args) {
        // TODO code application logic here

        boolean bool = true;
        System.out.println(bool);

        bool = false;
        System.out.println(bool);

        System.out.println(true);
        System.out.println(false);
        System.out.println(6 + 2 == 5);
        System.out.println(6 + 2 != 5);
        System.out.println(6 / 3 == 2);
        System.out.println(6 / 3 != 2);

        System.out.println(4 + 2 > 6);
        System.out.println(4 + 2 >= 6);
        System.out.println(8 / 4 < 2);
        System.out.println(8 / 4 <= 2);

        int x = 5;
        int x2 = 20;
        int x3 = 35;

        System.out.println(x > 10 && x < 30);
        System.out.println(x2 > 10 && x2 < 30);
        System.out.println(x3 > 10 && x3 < 30);

        System.out.println(x < 10 || x > 30);
        System.out.println(x2 < 10 || x2 > 30);
        System.out.println(x3 < 10 || x3 > 30);

        int x4 = 10;
        int x5 = 20;
        int x6 = 20;
        int x7 = 40;
        int x8 = 25;
        int x9 = 15;
        int x10 = 8;

        if (x4 == 10) {
            System.out.println("x4 sama dengan 10");
        }

        if (x5 < 30) {
            System.out.println("kondisi adalah true");
            System.out.println("x5 lebih kecil dari 30");
        }

        if (x6 < 30) {
            System.out.println("x6 lebih kecil dari 30");
        } else {
            System.out.println("x6 lebih besar dari 30 atau sama dengan 30");
        }

        if (x7 < 30) {
            System.out.println("x7 lebih kecil dari 30");
        } else {
            System.out.println("x7 lebih besar dari 30 atau sama dengan 30");
        }

        if (x8 >= 30) {
            System.out.println("x8 lebih besar atau sama dengan 30");
        } else if (x8 > 20) {
            System.out.println("x8 lebih besar dari 20 tapi lebih kecil dari 30");

        } else {
            System.out.println("x8 lebih kecil dari 20 atau sama dengan 20");
        }

        if (x9 >= 30) {
            System.out.println("x9 lebih besar atau sama dengan 30");
        } else if (x9 > 20) {
            System.out.println("x9 lebih besar dari 20 tapi lebih kecil dari 30");

        } else {
            System.out.println("x9 lebih kecil dari 20 atau sama dengan 20");
        }

        if (x % 2 == 0) {
            System.out.println("bilangan genap");

        } else {
            System.out.println("bilangan ganjil");
        }

        switch (x % 2) {
            case 0:
                System.out.println("bilangan genap");
                break;
            case 1:
                System.out.println("bilangan ganjil");
                break;
        }

        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        for (int a = 1; a <= 5; a++) {
            System.out.println("loncatan " + a);
        }

        for (int b = 1; b <= 10; b++) {
            if (b > 5) {
                break;
            }
            System.out.println("berhasil loop " + b);
        }

        for (int c = 1; c <= 10; c++) {
            if (c % 3 == 0) {
                continue;
            }
            System.out.println(c);
        }

        int[] numbers = {1, 2, 3};
        System.out.println(numbers[0]);
        System.out.println(numbers[2]);

        String[] names = {"yada", "kates", "john"};
        System.out.println(names[0]);
        System.out.println(names[2]);

        names[2] = "prasetyo";
        System.out.println(names[2]);

        for (int d = 0; d < 3; d++) {
            System.out.println("nama " + names[d]);
        }

        System.out.println(names.length);

        for (int d = 0; d < names.length; d++) {
            System.out.println("nama ku adalah " + names[d]);
        }

        for (String name : names) {
            System.out.println("nama saya adalah " + name);
        }

        // projek akhir
        int[] numbers2 = {1, 4, 6, 9, 13, 16};

        List<Integer> ganjil = new ArrayList<>();
        List<Integer> genap = new ArrayList<>();

        int totalGanjil = 0;
        int totalGenap = 0;

        for (int number : numbers2) {
            switch (number % 2) {
                case 0:
                    genap.add(number);
                    totalGenap += number;
                    break;
                case 1:
                    ganjil.add(number);
                    totalGanjil += number;
                    break;
            }
        }

        System.out.println("bilangan ganjil" + ganjil);
        System.out.println("bilangan genap" + genap);
        System.out.println("Jumlah bilangan ganjil " + totalGanjil);
        System.out.println("Jumlah bilangan genap " + totalGenap);

    }
}
