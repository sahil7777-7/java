abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("new animal");
    }
}
class hourse extends Animal{
    public void walk(){

        System.out.println("Walks on 4 legs");
    }
}

class chicken extends Animal{
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}

public class four {
    public static void main(String[] args){
        hourse h1=new hourse();
        h1.walk();

    }
}
