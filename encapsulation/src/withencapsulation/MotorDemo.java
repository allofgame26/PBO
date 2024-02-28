package withencapsulation;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.displaystatus();

        motor1.setPlat("B 0838 ZZ");
        motor1.setKecepatan(50);
        motor1.displaystatus();

        Motor motor2 = new Motor();
        motor2.setPlat("N 9480 AB");
        motor2.setMesinon(true);
        motor2.setKecepatan(120);
        motor2.displaystatus();

        Motor motor3 = new Motor();
        motor3.setPlat("D 8343 AB");
        motor3.setMesinon(true);
        motor3.setKecepatan(-5);
        motor3.displaystatus();
    }
}
