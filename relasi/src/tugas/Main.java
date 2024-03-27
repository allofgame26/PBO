package tugas;

public class Main {
    public static void main(String[] args) {
        Pengajar pengajar1 = new Pengajar();
        pengajar1.setNIP("123456");
        pengajar1.setNama("Enggar");

        Seminar seminar1 = new Seminar();
        seminar1.setNama("Seminar Teknologi IoT");
        seminar1.setTanggal("01/04/2024");
        seminar1.setPengisi(pengajar1);
        seminar1.tambahPeserta("2141762051", "Rizki Arya Prayoga", "Sistem Informasi Bisnis");
        seminar1.tambahPeserta("2241760015", "Oddis", "Sistem Informasi Bisnis");
        seminar1.tambahPeserta("2241760123", "Rozaq","Sistem Informasi Bisnis");
        seminar1.tambahPeserta("2241760120","Zaidan", "Sistem Informasi Bisnis");

        seminar1.getInfo();
    }
}
