package tugas;

public class dosen extends pegawai {

    public String matkul;

    public dosen(){

    }

    public  dosen (int id, String nama, String alamat, String kantor, int salary, String matkul){
        super(id,nama,alamat,kantor,salary);
        this.matkul = matkul;
    }
    public void displayinfo(){
        super.displayinfo();
        System.out.println("Mata Kuliah : "+matkul);
    }
}
