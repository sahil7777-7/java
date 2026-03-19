import java.util.ArrayList;
public class arraylist1 {
    public static void revrse(ArrayList<Integer>list){
        for(int i= list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }

    }
    public static void main(String[] args){
        ArrayList<Integer>list= new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(0,5);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
        revrse(list);

    }
}
