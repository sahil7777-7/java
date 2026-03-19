package inharitance;

public class car extends vehcial{
    private int door;

    public car(int speed, String brand,int door) {
        super(speed, brand);
        this.door=door;
        System.out.println("Door: "+door);

    }

}
