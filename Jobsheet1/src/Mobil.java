public class Mobil {
    public static void main(String[] args) {
        String merk1,merk2,merk3,merk4,merk5,warna1,warna2,warna3,warna4,warna5;
        int berat1,berat2,berat3,berat4,berat5,kecepatan1,kecepatan2,kecepatan3,kecepatan4,kecepatan5;
        String keadaan1,keadaan2,keadaan3,keadaan4,keadaan5,result1,result2,result3,result4,result5;

        // Mobil 1
        merk1 = "Toyota";
        warna1 = "Pink";
        berat1 = 100;
        kecepatan1 = 50;
        keadaan1 = "menyala";

        kecepatan1=tambahkecepatan(kecepatan1,30);
        result1 = menyala(keadaan1);
        tampil(merk1,warna1,berat1,kecepatan1,result1);

        // mobil2
        merk2 = "Honda";
        warna2 = "Kuning";
        berat2 = 120;
        kecepatan2 = 80;
        keadaan2 = "Mati";

        kecepatan2=tambahkecepatan(kecepatan2,30);
        result2 = menyala(keadaan2);
        tampil(merk2,warna2,berat2,kecepatan2,result2);

        // mobil3
        merk3 = "Suzuki";
        warna3 = "Putih";
        berat3 = 100;
        kecepatan3 = 40;
        keadaan3 = "menyala";

        kecepatan3=tambahkecepatan(kecepatan3,30);
        result3 = menyala(keadaan3);
        tampil(merk3,warna3,berat3,kecepatan3,result3);

        // mobil4
        merk4 = "Suzuki";
        warna4 = "Putih";
        berat4 = 100;
        kecepatan4 = 120;
        keadaan4 = "menyala";

        kecepatan4=tambahkecepatan(kecepatan4,30);
        result4 = menyala(keadaan4);
        tampil(merk4,warna4,berat4,kecepatan4,result4);

        // mobil5
        merk5 = "Lamborgini";
        warna5 = "Merah";
        berat5 = 150;
        kecepatan5 = 220;
        keadaan5 = "menyala";

        kecepatan5=tambahkecepatan(kecepatan5,30);
        result5 = menyala(keadaan5);
        tampil(merk5,warna5,berat5,kecepatan5,result5);
    }

    public static void tampil(String merk,String warna,int berat,int kecapatan,String result){
        System.out.println("Mobil :");
        System.out.println("Merk : "+merk);
        System.out.println("Warna : "+warna);
        System.out.println("Berat : "+berat);
        System.out.println("Kecepatan : "+kecapatan);
        System.out.println("Result : "+ result);
    }

    public static int tambahkecepatan(int kecepatan, int increment){
        kecepatan += increment;
        return kecepatan;
    }

    public static int kurangkecepatan(int kecepatan,int decrement){
        kecepatan -= decrement;
        return kecepatan;
    }

    public static String menyala(String keadaan){
        String hasil;
        if (keadaan == "menyala"){
            hasil = "Hidup";
        } else {
            hasil = "Mati";
        }
        return hasil;
    }
}
