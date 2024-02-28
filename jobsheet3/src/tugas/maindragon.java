package tugas;

public class maindragon {
    public static void main(String[] args) {
        dragon dragon1 = new dragon();
        dragon1.y = 0;
        dragon1.x = 0;
        dragon1.direction = 1;

        dragon1.move(4);
        dragon1.changedirection(2);
        dragon1.move(5);
        dragon1.cetakkoordinat();

        dragon dragon2 = new dragon(0,0);
        dragon2.direction = 4;

        dragon2.move(4);
        dragon2.changedirection(2);
        dragon2.move(5);
        dragon2.changedirection(3);
        dragon2.move(10);
        dragon2.cetakkoordinat();
    }
}
