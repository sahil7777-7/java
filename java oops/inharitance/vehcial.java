package inharitance;

public class vehcial {
    public String brand;
    public int speed;

    public vehcial(int speed, String brand) {
        this.speed = speed;
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void displayinfo(){
        System.out.println("Brand: "+brand+"\nSpeed: "+speed);
    }
}
