class pen{
    String color;
    double thin;
    public void write(){
        System.out.println("something writing");
    }
    public void printcolor(String color,double thin){
        System.out.println(this.color);
        System.out.println(this.thin);
    }
    public void printcolor(double thin,String color){
        System.out.println(this.thin);
        System.out.println(this.color);

    }
    public void printcolor(String color){
        System.out.println(this.color);
    }
    public void printcolor(double thin){
        System.out.println(this.thin);
    }
}
public class First {
    public static void main(String[] args){
           pen pen1=new pen();
           pen1.color="red";
           pen1.thin=1.3;
           pen1.printcolor(pen1.thin, pen1.color);

           
    }
}