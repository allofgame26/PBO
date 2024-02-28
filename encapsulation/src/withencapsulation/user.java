package withencapsulation;

public class user {
    public String username, nama,email,alamat,pekerjaan;

    public user(String username,String nama,String email){
        this.username = username;
        this.nama = nama;
        this.email = email;
    }

    public void cetakinfo(){
        System.out.println("Username :"+username);
        System.out.println("Nama : "+nama);
        System.out.println("Email : "+email);
        System.out.println("Alamat : "+alamat);
        System.out.println("Pekerjaan : "+pekerjaan);
        System.out.println("=======================");
    }
}
