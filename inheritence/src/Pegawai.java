public class Pegawai {
    private int idpegawai, salary;
    private String nama, alamat,kantor;

    public Pegawai(int id, String nama, String alamat, String kantor, int salary ){
        this.idpegawai = id;
        this.nama = nama;
        this.alamat = alamat;
        this.kantor = kantor;
        this.salary = salary;
    }

    public Pegawai(){

    }

    public int getIdpegawai() {
        return idpegawai;
    }

    public void setIdpegawai(int idpegawai) {
        this.idpegawai = idpegawai;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKantor() {
        return kantor;
    }

    public void setKantor(String kantor) {
        this.kantor = kantor;
    }
    public void displayinpo(){
        System.out.println("ID Pegawai : "+getIdpegawai());
        System.out.println("Nama : "+getNama());
        System.out.println("Alamat : "+getAlamat());
        System.out.println("Tempat Kerja : "+getKantor() );
        System.out.println("Salary : "+getSalary());
    }
}
