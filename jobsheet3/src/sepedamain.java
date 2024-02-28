public class sepedamain {
    public static void main(String[] args) {
        sepeda sepeda1 = new sepeda(5,1);
        sepeda1.tambahkecepatan(3);
        sepeda1.cetak();

        sepeda sepeda2 = new sepeda();
        sepeda2.kecepatan = 7;
        sepeda2.gear = 1;
        sepeda2.cetak();
    }
}
