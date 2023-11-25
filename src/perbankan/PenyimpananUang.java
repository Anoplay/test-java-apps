/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan;

/**
 *
 * @author agung
 */
public class PenyimpananUang extends Tabungan2{
    private double tingkatBunga;
    
    public PenyimpananUang(int saldo, double tingkatBunga) {
        tingkatBunga = saldo * tingkatBunga;
        this.tingkatBunga = tingkatBunga + saldo;
        
    }
    
    public double cekUang() {
        return tingkatBunga;
    }
    
}
