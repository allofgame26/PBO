package tugas;

public class dragon {
    int x,y,direction;

    public dragon(){

    }

    public dragon(int a,int b){
        x = a;
        y = b;
    }

    public void changedirection(int newdirection){
        direction = newdirection;
    }

    public void move(int step){
        switch (direction){
            case 1 :
                y = y + step;
                break;
            case 2 :
                x = x + step;
                break;
            case 3 :
                y = y - step;
                break;
            case 4 :
                x = x - step;
                break;
        }
    }

    public void cetakkoordinat(){
        System.out.println("Koordinat X : "+x);
        System.out.println("Koordinat Y : "+y);
        System.out.println("=================");
    }
}
