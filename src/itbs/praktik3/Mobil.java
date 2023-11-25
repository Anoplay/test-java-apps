/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itbs.praktik3;

/**
 *
 * @author agung
 */
public class Mobil extends Kendaraan{

    String bahanBakar;
    int kapasitasMesin;

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setKapasitasMesin(int kapasitas) {
        kapasitasMesin = kapasitas;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }
}
