public class Pegawai {
    public String nip, nama;
    public double gaji;
    /*public Pegawai(){
        System.out.println("Objek dari kelas pegawai dibuat");
    }*/

    public Pegawai(String nip, String nama, double gaji){
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }
    public String getinfo(){
        String info = "";
        info += "NIP    : "+ nip +"\n";
        info += "Nama    : "+ nama +"\n";
        info += "gaji    : "+ gaji +"\n";

        return info;
    }
}
