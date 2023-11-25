/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itbs.praktik2;

/**
 *
 * @author agung
 */
public class Utama {

    public static void main(String args[]) {
        Manusia orang1 = new Manusia();
        orang1.setNama("Yada");
        orang1.setUmur(30);
        System.out.println("Nama:  " + orang1.getNama());
        System.out.println("Umur: " + orang1.getUmur());
        orang1.cetak();

        Manusia orang2 = new Manusia("Anoplay");
        System.out.println("Nama:  " + orang2.getNama());
        System.out.println("Umur: " + orang1.getUmur());
        orang2.cetak();

        Manusia orang3 = new Manusia("El Gato", 25);
        System.out.println("Nama:  " + orang3.getNama());
        System.out.println("Umur: " + orang3.getUmur());
        orang3.cetak();

    }
}
