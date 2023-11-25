/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itbs.praktik;

/**
 *
 * @author agung
 */
public class Tabungan2 {

    private int saldo;

    public Tabungan2(int saldoAwal) {
        saldo = saldoAwal;
    }

    public int getSaldo() {
        return saldo;
    }

    public void simpanUang(int jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
        }
    }

    public boolean ambilUang(int jumlah) {
        if (jumlah > 0 && saldo >= jumlah) {
            saldo -= jumlah;
            return true;
        } else {
            return false;
        }
    }
}
