public class Officeboy extends Pegawai {
    private int tugaslasntai;

    public int getTugaslasntai() {
        return tugaslasntai;
    }

    public Officeboy(int id, String nama, String alamat, String kantor, int salary, int tugaslasntai){
        super(id, nama, alamat, kantor, salary);
        setTugaslasntai(tugaslasntai);
    }

    public Officeboy(){

    }

    public void setTugaslasntai(int tugaslasntai) {
        this.tugaslasntai = tugaslasntai;
    }

    @Override
    public void displayinpo() {
        super.displayinpo();
        System.out.println("Tugas Lantai : "+getTugaslasntai());
    }
}
