public class sepeda {
    float kecepatan;
    int gear;
    public sepeda(float newkecepatan,int newgear){
        kecepatan = newkecepatan;
        gear = newgear;
    }

    public sepeda(){

    }

    public void tambahkecepatan(float increment){
        kecepatan += increment;
    }

    public void kurangkecepatan(float decrement){
        kecepatan -= decrement;
    }

    public void cetak(){
        System.out.println("Kecepatan : "+ kecepatan);
        System.out.println("Gear : "+ gear);
        System.out.println("========================");
    }
}
