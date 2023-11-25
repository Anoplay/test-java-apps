/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itbs.praktik2;

/**
 *
 * @author agung
 */
public class Manusia {

    int umur;
    String nama;

    Manusia() {

    }

    Manusia(String nama) {
        this.nama = nama;
    }

    Manusia(String nama, int umur) {
        this.umur = umur;
        this.nama = nama;
    }

    public void setUmur(int i) {
        umur = i;
    }

    public int getUmur() {
        return umur;
    }

    public void setNama(String s) {
        nama = s;
    }

    public String getNama() {
        return nama;
    }

    public void cetak() {
        System.out.println("Pakai method cetak");
        System.out.println("Nama:  " + nama);
        System.out.println("Umur: " + umur);
    }
}
