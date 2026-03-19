
interface anm {
    public void walk();

}
interface hero{
    public void name();
}
class tiger implements anm, hero{
    public void walk(){
        System.out.println("walk on 4 leg");
    }
    public void name(){
        System.out.println("Tiger");
    }
}
public class five {
    public static void main(String[] args){
        tiger t1=new tiger();
        t1.walk();
        t1.name();
    }
}
