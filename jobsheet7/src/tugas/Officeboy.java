package tugas;

public class Officeboy extends pegawai{
    public int lantai;

    public Officeboy(){

    }

    public Officeboy(int id, String nama, String alamat, String kantor, int salary,int lantai){
        super(id,nama,alamat,kantor,salary);
        this.lantai = lantai;
    }

    public void displayinfo(){
        System.out.println("Lantai : "+lantai);
    }
}
