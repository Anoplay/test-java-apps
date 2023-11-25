/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sekolah;

/**``
 *
 * @author agung
 */
public class Kelas {

    private int kodeKelas;
    private String namaKelas;
    private Mahasiswa mahasiswa;

    public Kelas(int kode, String nama) {
        this.kodeKelas = kode;
        this.namaKelas = nama;
    }

    public void setMhs(Mahasiswa mhs) {
        this.mahasiswa = mhs;
    }

    public int getKodeKelas() {
        return kodeKelas;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }
}
