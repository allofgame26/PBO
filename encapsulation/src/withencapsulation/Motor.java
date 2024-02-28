package withencapsulation;

public class Motor {
    private String plat;
    private boolean mesinon;
    private int kecepatan;

    public String getPlat(){
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public boolean isMesinon() {
        return mesinon;
    }

    public void setMesinon(boolean mesinon) {
        this.mesinon = mesinon;
    }

    public void setKecepatan(int kecepatan) {
        if (!this.mesinon && kecepatan > 0){
            System.out.println("Kecepatan tidak boleh lebih dari 0 jike mesin off");
        } else if (this.mesinon && kecepatan > 100) {
            System.out.println("Kecepatan tidak boleh lebih dari 100 karena Maksimum");
        } else if (this.mesinon && kecepatan < 0) {
            System.out.println("Kecepatan tidak boleh kurang dari 0 karena nilai Minimum");
        } else {
            this.kecepatan = kecepatan;
        }
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void displaystatus(){
        System.out.println("Plat Nomor : "+ this.plat);

        if (mesinon){
            System.out.println("Mesin ON");
        } else {
            System.out.println("Mesin OFF");
        }

        System.out.println("Kecepatan : "+this.kecepatan);
        System.out.println("=============================");
    }
}
