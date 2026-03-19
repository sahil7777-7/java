package inharitance;

public class bike extends car{


    public bike(int speed, String brand, int door) {
        super(speed, brand, door);
    }
    public static void main(String[] args){

        car ca1=new car(20,"maruti",4);
        ca1.displayinfo();
    }
}
