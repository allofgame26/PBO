package tugas;

public class pegawai {
    public int idpegawai, salary;
    public String nama,alamat,kantor;

    public pegawai(){

    }

    public pegawai(int id, String nama, String alamat, String kantor, int salary){
        this.idpegawai = id;
        this.nama = nama;
        this.alamat = alamat;
        this.kantor = kantor;
        this.salary = salary;
    }

    public void displayinfo (){
        System.out.println("ID Pegawai : "+idpegawai);
        System.out.println("Nama : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("Kantor : "+kantor);
        System.out.println("Salary : "+salary);
    }
}
