/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itbs.praktik2;

/**
 *
 * @author agung
 */
public class Tugas {

    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai(11111);
        Pegawai pegawai2 = new Pegawai(22222, "Yada");

        System.out.println("Nama: " + pegawai1.nama);
        System.out.println("NIP : " + pegawai1.nip);

        System.out.println("Nama: " + pegawai2.nama);
        System.out.println("NIP : " + pegawai2.nip);
    }
}
