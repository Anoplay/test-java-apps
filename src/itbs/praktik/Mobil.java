/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itbs.praktik;

/**
 *
 * @author agung
 */
public class Mobil {

    String merek;
    String warna;
    String jenis;
    int kapasitasMesin;
    int kapasitasPenumpang;

    public Mobil(String a, String b, String c, int d, int e) {
       merek = a;
       warna = b;
       jenis = c;
       kapasitasMesin = d;
       kapasitasPenumpang = e;
    }

    public void infoMobil() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Jenis: " + jenis);
        System.out.println("Kapasitas Mesin: " + kapasitasMesin + " cc");
        System.out.println("Kapasitas Penumpang: " + kapasitasPenumpang);
    }

}
