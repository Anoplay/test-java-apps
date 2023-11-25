/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itbs.praktik;

/**
 *
 * @author agung
 */
public class Truk {

    double muatan;
    double muatanmaks;

    public Truk(double beratmaks) {
        muatanmaks = beratmaks;
    }

    public double getMuatan() {
        return muatan;
    }

    public double getMuatanMaks() {
        return muatanmaks;
    }

    public void tambahMuatan(double berat) {
        double hasilMuatan = muatan + berat;
        
        if(hasilMuatan <= muatanmaks) {
            muatan = hasilMuatan;
        } 
    }

}
