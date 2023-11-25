/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan;

/**
 *
 * @author agung
 */
public class Bank {

    private Nasabah[] nasabah = new Nasabah[4];
    private int jumlahNasabah;

    public Bank() {
        super();
    }

    public void tambahNasabah(String namaAwal, String namaAkhir) {
        nasabah[jumlahNasabah] = new Nasabah(namaAwal, namaAkhir);
        jumlahNasabah++;
    }

    public int getJumlahNasabah() {
        return jumlahNasabah;
    }

    public Nasabah getNasabah(int indeks) {
        return nasabah[indeks];
    }

}
