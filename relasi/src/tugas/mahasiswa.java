package tugas;

public class mahasiswa {
    private String NIM;
    private String nama;
    private String jurusan;

    public mahasiswa() {
        // Konstruktor kosong
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setNIM(String nim) {
        this.NIM = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void getInfo() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
    }

}
