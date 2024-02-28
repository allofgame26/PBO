package noencapsulation;

public class motor {
    public String plat;
    public boolean mesinon;
    public int kecepatan;

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
