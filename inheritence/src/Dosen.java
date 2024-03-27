public class Dosen extends Pegawai{
    private String matkul;

    public String getMatkul() {
        return matkul;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    @Override
    public void displayinpo() {
        super.displayinpo();
        System.out.println("Matkul yang diajarkan : "+getMatkul());
    }
}
