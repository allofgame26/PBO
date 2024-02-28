package tugas;

public class snake {

    public snake(int a, int b){
        x = a;
        y = b;
    }

    public snake(){

    }
    int x,y;

    public void moveleft(){
        x = x - 1;
    }
    public void moveright(){
        x = x + 1;
    }
    public void moveup(){
        y = y + 1;
    }
    public void movedown(){
        y = y - 1;
    }
    public void printkoordinat(){
        System.out.println("Koordinat X : "+x);
        System.out.println("Koordinat Y : "+y);
        System.out.println("=================");
    }

    public static void main(String[] args) {
        snake ular1 = new snake();
        ular1.x = 0;
        ular1.y = 0;
        ular1.movedown();
        ular1.moveleft();
        ular1.moveleft();
        ular1.printkoordinat();

        snake ular2 = new snake(0,0);
        ular2.moveup();
        ular2.moveup();
        ular2.moveright();
        ular2.moveright();
        ular2.printkoordinat();
    }
}
