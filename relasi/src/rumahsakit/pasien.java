package rumahsakit;
import java.util.ArrayList;
import java.time.LocalDate;

public class pasien {
    private String norekammedis;
    private String nama;
    private ArrayList<konsultasi> konsultasi;

    public String getNorekammedis(){
        return norekammedis;
    }
    public String getNama(){
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNorekammedis(String norekammedis) {
        this.norekammedis = norekammedis;
    }

    public pasien(String norekammedis, String nama){
        this.norekammedis = norekammedis;
        this.nama = nama;
        this.konsultasi = new ArrayList<>();
    }

    public String getinfo(){
        String info = "";
        info += "No Rekam Medis : " + this.norekammedis + "\n";
        info += "Nama           : " + this.nama + "\n";

        if (!konsultasi.isEmpty()){
            info += " Riwayat Konsultasi :\n";

            for (konsultasi konsultasi1 : konsultasi){
                info += konsultasi1.getinfo();
            }
        } else {
            info += "Belum ada Riwayat konsultasi";
        }

        info += "\n";

        return info;
    }

    public void tambahkonsultasi(LocalDate tanggal, pegawai dokter, pegawai perawat){
        konsultasi konsultasi1 = new konsultasi();
        konsultasi1.setTanggal(tanggal);
        konsultasi1.setDokter(dokter);
        konsultasi1.setPerawat(perawat);
        konsultasi.add(konsultasi1);
    }
}
