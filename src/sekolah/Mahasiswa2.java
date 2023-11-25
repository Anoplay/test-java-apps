/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sekolah;

/**
 *
 * @author agung
 */
public class Mahasiswa2 {

    private int nrp;
    private String nama;

    public Mahasiswa2() {
        this(0, "");
    }

    public Mahasiswa2(String nama) {
        this(0, nama);
    }

    public Mahasiswa2(int nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }

    public int getNrp() {
        return nrp;
    }

    public String getNama() {
        return nama;
    }
}
