/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan;

/**
 *
 * @author agung
 */
public class PengambilanUang extends Tabungan2 {

    private int proteksi;

    public PengambilanUang(int saldo, int tingkatBunga) {
       setSaldo(saldo - tingkatBunga);
       proteksi = tingkatBunga;

    }

    public int getSaldo() {
        return super.getSaldo() + proteksi;
    }
    
    public boolean ambilUang(int jumlah) {
        if(jumlah <= super.getSaldo()) {
            setSaldo(super.getSaldo() - jumlah);
            return true;
        } else {
            return false;
        }
    }

}
