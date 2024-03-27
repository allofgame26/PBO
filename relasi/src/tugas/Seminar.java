package tugas;
import java.util.ArrayList;

public class Seminar {
    private String nama;
    private ArrayList<Mahasiswa> peserta;
    private Pengajar pengisi;
    private String tanggal;

    public Seminar() {
        peserta = new ArrayList<>();
    }

    public String getTanggal() {
        return tanggal;
    }

    public Pengajar getPengisi() {
        return pengisi;
    }

    public String getNama() {
        return nama;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void setPengisi(Pengajar pengisi) {
        this.pengisi = pengisi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tambahPeserta(String NIM, String nama, String jurusan) {
        Mahasiswa pesertaBaru = new Mahasiswa();
        pesertaBaru.setNIM(NIM);
        pesertaBaru.setNama(nama);
        pesertaBaru.setJurusan(jurusan);
        peserta.add(pesertaBaru);
    }

    public void getInfo() {
        System.out.println("Nama Seminar: " + getNama());
        System.out.println("Tanggal Seminar: " + getTanggal());
        System.out.println("Pengisi Seminar:");
        pengisi.getInfo();
        System.out.println("Daftar Peserta:");
        for (Mahasiswa pesertaSeminar : peserta) {
            pesertaSeminar.getInfo();
            System.out.println();
        }
    }
}
