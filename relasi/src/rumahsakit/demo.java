package rumahsakit;

import java.time.LocalDate;

public class demo {
    public static void main(String[] args) {
        pegawai ani = new pegawai("1234","dr. Ani");
        pegawai bagus = new pegawai("4567", "dr. Bagus");

        pegawai desi = new pegawai("1234", "Ns. Desi");
        pegawai eka = new pegawai("4567", "Ns. Eka");

        pasien pasien1 = new pasien("Puspa Widya", "343298");
        pasien1.tambahkonsultasi(LocalDate.of(2021, 8,11),ani,desi);
        pasien1.tambahkonsultasi(LocalDate.of(2021,9,11),bagus, eka);

        System.out.println(pasien1.getinfo());

        pasien pasien2 = new pasien("Yenny Anggaeni","997744");
        System.out.println(pasien2.getinfo());
    }
}
