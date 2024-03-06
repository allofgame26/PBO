package rumahsakit;

public class pegawai {
    private String nip;
    private String nama;

    public pegawai(String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }

    public String getNip(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getinfo(){
        return nama + " ( " + nip + ")";
    }
}
