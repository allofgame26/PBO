package rumahsakit;
import java.time.LocalDate;

public class konsultasi {
    private LocalDate tanggal;
    private pegawai dokter;
    private pegawai perawat;

    public LocalDate getTanggal() {
        return tanggal;
    }

    public pegawai getDokter() {
        return dokter;
    }

    public pegawai getPerawat() {
        return perawat;
    }

    public void setDokter(pegawai dokter) {
        this.dokter = dokter;
    }

    public void setPerawat(pegawai perawat) {
        this.perawat = perawat;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public String getinfo(){
        String info = "";
        info += "\t Tanggal : " + tanggal;
        info += ", Dokter : " + dokter.getinfo();
        info += ", Perawat : " + perawat.getinfo();
        info += "\n";

        return info;
    }
}
