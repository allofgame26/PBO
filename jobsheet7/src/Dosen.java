public class Dosen extends Pegawai {
    public String nidn;

    public Dosen(String nip, String nama, double gaji, String nidn){
        super(nip,nama,gaji);
        this.nidn = nidn;
    }
    /*public Dosen(){
        System.out.println(gaji);
        System.out.println("Objek dari Class Dosen telah dibuat");
    }*/

    public String getAllInfo(){
        String info = this.getinfo();
        info += "NIP        : " +super.nip+ "\n";
        info += "Nama       : " +super.nama+ "\n";
        info += "Gaji       : " +super.gaji+ "\n";
        info += "NIDN       : " +this.nidn+ "\n";

        return info;
    }

    public String getinfo(){
        return "NIDN    : "+this.nidn+"\n";
    }
}
