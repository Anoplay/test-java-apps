/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itbs.praktik3;

/**
 *
 * @author agung
 */
public class Tes {

    public static void main(String[] args) {
        
        Truk truk1 = new Truk();
        truk1.setJumlahRoda(4);
        truk1.setJumlahWarna("Kuning");
        truk1.setBahanBakar("Solar");
        truk1.setKapasitasMesin(1500);
        truk1.setMuatanMaks(1000);
        
        Truk truk2 = new Truk();
        truk2.setJumlahRoda(6);
        truk2.setJumlahWarna("Merah");
        truk2.setBahanBakar("Solar");
        truk2.setKapasitasMesin(2000);
        truk2.setMuatanMaks(5000);
        
        Taksi taksi1 = new Taksi();
        taksi1.setJumlahRoda(4);
        taksi1.setJumlahWarna("Oranye");
        taksi1.setBahanBakar("Bensin");
        taksi1.setKapasitasMesin(1500);
        taksi1.setTarifAwal(10000);
        taksi1.setTarifPerKM(5000);
        
        Taksi taksi2 = new Taksi();
        taksi2.setJumlahRoda(4);
        taksi2.setJumlahWarna("Biru");
        taksi2.setBahanBakar("Bensin");
        taksi2.setKapasitasMesin(1300);
        taksi2.setTarifAwal(7000);
        taksi2.setTarifPerKM(3500);
        
        Sepeda sepeda1 = new Sepeda();
        sepeda1.setJumlahRoda(3);
        sepeda1.setJumlahWarna("Hitam");
        sepeda1.setJumlahSadel(1);
        sepeda1.setJumlahGir(2); 
       
        Sepeda sepeda2 = new Sepeda();
        sepeda2.setJumlahRoda(2);
        sepeda2.setJumlahWarna("Putih");
        sepeda2.setJumlahSadel(2);
        sepeda2.setJumlahGir(5);

        System.out.println("Truk 1:");
        System.out.println("Jumlah Roda: " + truk1.getJumlahRoda());
        System.out.println("Warna: " + truk1.getJumlahWarna());
        System.out.println("Bahan Bakar: " + truk1.getBahanBakar());
        System.out.println("Kapasitas Mesin: " + truk1.getKapasitasMesin());
        System.out.println("Muatan Maksimal: " + truk1.getMuatanMaks());
        
        System.out.println();
        System.out.println("Truk 2:");
        System.out.println("Jumlah Roda: " + truk2.getJumlahRoda());
        System.out.println("Warna: " + truk2.getJumlahWarna());
        System.out.println("Bahan Bakar: " + truk2.getBahanBakar());
        System.out.println("Kapasitas Mesin: " + truk2.getKapasitasMesin());
        System.out.println("Muatan Maksimal: " + truk2.getMuatanMaks());

        System.out.println();
        System.out.println("Sepeda 1:");
        System.out.println("Jumlah Roda: " + sepeda1.getJumlahRoda());
        System.out.println("Warna: " + sepeda1.getJumlahWarna());
        System.out.println("Jumlah Sadel: " + sepeda1.getJumlahSadel());
        System.out.println("Jumlah Gir: " + sepeda1.getJumlahGir());
        
        System.out.println();
        System.out.println("Sepeda 2:");
        System.out.println("Jumlah Roda: " + sepeda2.getJumlahRoda());
        System.out.println("Warna: " + sepeda2.getJumlahWarna());
        System.out.println("Jumlah Sadel: " + sepeda2.getJumlahSadel());
        System.out.println("Jumlah Gir: " + sepeda2.getJumlahGir());

        System.out.println();
        System.out.println("Taksi 1:");
        System.out.println("Jumlah Roda: " + taksi1.getJumlahRoda());
        System.out.println("Warna: " + taksi1.getJumlahWarna());
        System.out.println("Bahan Bakar: " + taksi1.getBahanBakar());
        System.out.println("Kapasitas Mesin: " + taksi1.getKapasitasMesin());
        System.out.println("Tarif Awal: " + taksi1.getTarifAwal());
        System.out.println("Tarif per KM: " + taksi1.getTarifPerKM());
        
        System.out.println();
        System.out.println("Taksi 2:");
        System.out.println("Jumlah Roda: " + taksi2.getJumlahRoda());
        System.out.println("Warna: " + taksi2.getJumlahWarna());
        System.out.println("Bahan Bakar: " + taksi2.getBahanBakar());
        System.out.println("Kapasitas Mesin: " + taksi2.getKapasitasMesin());
        System.out.println("Tarif Awal: " + taksi2.getTarifAwal());
        System.out.println("Tarif per KM: " + taksi2.getTarifPerKM());

    }
}
