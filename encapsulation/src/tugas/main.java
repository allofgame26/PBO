package tugas;

public class main {
    public static void main(String[] args) {
        anggota anggota1 = new anggota("111333444","Donny",5000000);

        System.out.println("Nama Anggota : "+anggota1.getNama());
        System.out.println("Limit Peminjaman : "+anggota1.getLimit());

        System.out.println("\n Meminjam Uang 10.000.000");
        anggota1.pinjam(10000000);
        System.out.println("Jumlah Pinjaman saat ini : "+anggota1.getJumlah());

        System.out.println("\n Meminjam Uang 4.000.000");
        anggota1.pinjam(4000000);
        System.out.println("Jumlah Pinjaman saat ini : "+anggota1.getJumlah());

        System.out.println("\n Membayar Uang 1.000.000");
        anggota1.bayar(1000000);
        System.out.println("Jumlah Pinjaman saat ini : "+anggota1.getJumlah());

        System.out.println("\n Membayar Uang 3.000.000");
        anggota1.bayar(3000000);
        System.out.println("Jumlah Pinjaman saat ini : "+anggota1.getJumlah());
    }
}
