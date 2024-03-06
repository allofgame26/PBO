package tugas;
import java.util.ArrayList;

public class seminar {
    private String nama;
    private ArrayList<mahasiswa> peserta;
    private pengajar pengisi;
    private String tanggal;

    public seminar() {
        peserta = new ArrayList<>();
    }

    public String getTanggal() {
        return tanggal;
    }

    public pengajar getPengisi() {
        return pengisi;
    }

    public String getNama() {
        return nama;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void setPengisi(pengajar pengisi) {
        this.pengisi = pengisi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tambahPeserta(String NIM, String nama, String jurusan) {
        mahasiswa pesertaBaru = new mahasiswa();
        pesertaBaru.setNIM(NIM);
        pesertaBaru.setNama(nama);
        pesertaBaru.setJurusan(jurusan);
        peserta.add(pesertaBaru);
    }

    public void getInfo() {
        System.out.println("Nama Seminar: " + nama);
        System.out.println("Tanggal Seminar: " + tanggal);
        System.out.println("Pengisi Seminar:");
        pengisi.getInfo();
        System.out.println("Daftar Peserta:");
        for (mahasiswa pesertaSeminar : peserta) {
            pesertaSeminar.getInfo();
            System.out.println();
        }
    }
}
