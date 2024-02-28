package tugas;

public class anggota {
    public String ktp,nama;
    public int limit,jumlah;

    public anggota(String ktp,String nama,int limit){
        this.ktp = ktp;
        this.nama = nama;
        this.limit = limit;
    }
    public anggota(){
    }

    public String getNama(){
        return nama;
    }

    public int getLimit(){
        return limit;
    }
    public String getKtp(){
        return ktp;
    }

    public int getJumlah(){
        return jumlah;
    }

    public void pinjam(int pinjam){
        if (pinjam > this.limit){
            System.out.println("Maaf pinjaman anda Ditolak dan melebihi limit");
        } else {
            this.jumlah = this.jumlah + pinjam;
        }
    }

    public void bayar(int bayar){
        double sementara = jumlah * 0.1;
        if (bayar < sementara){
            System.out.println("Maaf Angsuran harus 10% dari jumlah pinjaman");
        } else {
            this.jumlah = this.jumlah - bayar;
        }
    }


}
