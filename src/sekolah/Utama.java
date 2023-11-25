/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sekolah;

/**
 *
 * @author agung
 */

import sekolah.Kelas;
import sekolah.Mahasiswa;

public class Utama {

    public static void main(String args[]) {
        Kelas kelasA = new Kelas(1, "Kelas A");
        Kelas kelasB = new Kelas(2, "Kelas B");

        Mahasiswa mahasiswa1 = new Mahasiswa(11, "Yada");
        Mahasiswa mahasiswa2 = new Mahasiswa(22, "Anoplay");
        Mahasiswa mahasiswa3 = new Mahasiswa(33, "El Gato");

        kelasA.setMhs(mahasiswa1);
        kelasA.setMhs(mahasiswa2);
        kelasB.setMhs(mahasiswa3);

        System.out.println("Kode Kelas: " + kelasA.getKodeKelas());
        System.out.println("Nama Kelas: " + kelasA.getNamaKelas());
        System.out.println("Mahasiswa di Kelas A: " + kelasA.getMahasiswa().getNama());

        System.out.println("Kode Kelas: " + kelasB.getKodeKelas());
        System.out.println("Nama Kelas: " + kelasB.getNamaKelas());
        System.out.println("Mahasiswa di Kelas B: " + kelasB.getMahasiswa().getNama());
    }
}
