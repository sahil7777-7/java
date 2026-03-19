class printpen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
    public void printtype(){
        System.out.println(this.type);
    }
}
public class printpenClass {
    public static void main(String[] args){

        printpen pen1=new printpen();
        pen1.color="blue";
        pen1.type="gel";

        printpen pen2=new printpen();
        pen2.color="red";
        pen2.type="ballpoint";

        pen1.printcolor();

    }
}
