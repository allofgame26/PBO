import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner intku = new Scanner(System.in);
        Scanner strku = new Scanner(System.in);

        int angka1,angka2,hasil = 0;
        String opeator;

        System.out.println("Masukkan Angka Pertama : ");
        angka1 = intku.nextInt();

        System.out.println("Masukkan Angka kedua : ");
        angka2 = intku.nextInt();

        System.out.println("Masukkan Operator yang diinginkan : ");
        opeator = strku.next();

        desisi(angka1,angka2,hasil,opeator);

    }

    public static void tampil(int angka1, int angka2, int hasil, String op){
        System.out.println(angka1+" "+op+" "+angka2+" = "+hasil);
    }

    public static int desisi (int angka1, int angka2, int hasil, String op){
        switch (op){
            case "+" :
                hasil = angka1 + angka2;
                tampil(angka1,angka2,hasil,op);
                break;
            case "-" :
                hasil = angka1 - angka2;
                tampil(angka1,angka2,hasil,op);
                break;
            case "*" :
                hasil = angka1 * angka2;
                tampil(angka1,angka2,hasil,op);
                break;
            case "/" :
                hasil = angka1 / angka2;
                tampil(angka1,angka2,hasil,op);
                break;
            case "%" :
                hasil = angka1 % angka2;
                tampil(angka1,angka2,hasil,op);
                break;
            default:
                System.out.println("Kesalahan Sistem");
        }
        return hasil;
    }
}
