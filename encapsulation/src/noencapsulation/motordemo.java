package noencapsulation;

public class motordemo {
    public static void main(String[] args) {
        motor motor1 = new motor();
        motor1.displaystatus();

        motor1.plat = "B 0838 ZZ";
        motor1.kecepatan =  50;
        int kecepatanbaru = 50;
        if (!motor1.mesinon && kecepatanbaru > 0){
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor1.kecepatan = kecepatanbaru;
        }
        motor1.displaystatus();

        motor motor2 = new motor();
        motor2.plat = "N 9480 AB";
        motor2.mesinon = true;
        motor2.kecepatan = 40;
        kecepatanbaru = 40;
        if (!motor2.mesinon && kecepatanbaru > 0){
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor2.kecepatan = kecepatanbaru;
        }
        motor2.displaystatus();

        motor motor3 = new motor();
        motor3.plat = "D 8343 AB";
        motor3.kecepatan = 60;
        kecepatanbaru = 60;
        if (!motor3.mesinon && kecepatanbaru > 0){
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor3.kecepatan = kecepatanbaru;
        }
        motor3.displaystatus();
    }
}
