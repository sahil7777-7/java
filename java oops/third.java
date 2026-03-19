import java.util.*;
import bank.*;
class shap{
    public void area(){
        System.out.println("display area");
    }
}
class tringle extends shap{
    public void area(int l, int b) {
        System.out.println((l*b)/2);
    }
}
public class third {
    public static void main(String[] args){

        bank.account acc=new bank.account();
        acc.name="sahil";
        System.out.println(acc.name);

        tringle tr1=new tringle();
        tr1.area();
        tr1.area(8,9);

    }
}
