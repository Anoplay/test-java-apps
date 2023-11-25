/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sekolah;

/**
 *
 * @author agung
 */
public class Utama2 {

    public static void main(String args[]) {
        Mahasiswa2 mahasiswa1 = new Mahasiswa2();
        System.out.println("NRP: " + mahasiswa1.getNrp());
        System.out.println("Nama: " + mahasiswa1.getNama());

        Mahasiswa2 mahasiswa2 = new Mahasiswa2("Yada");
        System.out.println("NRP: " + mahasiswa2.getNrp());
        System.out.println("Nama: " + mahasiswa2.getNama());

        Mahasiswa2 mahasiswa3 = new Mahasiswa2(22, "Anoplay");
        System.out.println("NRP: " + mahasiswa3.getNrp());
        System.out.println("Nama: " + mahasiswa3.getNama());
    }
}
