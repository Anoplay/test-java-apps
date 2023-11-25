/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itbs.praktik3;

/**
 *
 * @author agung
 */
public class Taksi extends Mobil{

    int tarifAwal;
    int tarifPerKM;

    public void setTarifAwal(int tarif) {
        tarifAwal = tarif;
    }

    public int getTarifAwal() {
        return tarifAwal;
    }

    public void setTarifPerKM(int tarif) {
        tarifPerKM = tarif;
    }

    public int getTarifPerKM() {
        return tarifPerKM;
    }
}
