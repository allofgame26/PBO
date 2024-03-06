package tugas;

public class main {
    public static void main(String[] args) {
        pengajar pengajar1 = new pengajar();
        pengajar1.setNIP("123456");
        pengajar1.setNama("Enggar");

        seminar seminar1 = new seminar();
        seminar1.setNama("Seminar Teknologi IoT");
        seminar1.setTanggal("01/04/2024");
        seminar1.setPengisi(pengajar1);
        seminar1.tambahPeserta("2141762051", "Rizki Arya Prayoga", "Sistem Informasi Bisnis");
        seminar1.tambahPeserta("2241760015", "Oddis", "Sistem Informasi Bisnis");

        seminar1.getInfo();
    }
}
