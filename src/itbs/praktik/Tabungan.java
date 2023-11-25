/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itbs.praktik;

/**
 *
 * @author agung
 */
public class Tabungan {

    int saldo;

    public Tabungan(int i) {
        saldo = i;
    }

    public void ambilUang(int i) {
        saldo = saldo - i;
    }
}
