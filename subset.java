import java.util.ArrayList;

public class subset {
    public static void findset(int n, ArrayList<Integer>sub){
        if (n==0){
            for (int i=0;i<sub.size();i++){
                System.out.print(sub.get(i)+" ");
            }
            System.out.println();
            return;
        }
        sub.add(n);//add hoga
        findset(n-1,sub);

        sub.remove(sub.size()-1);
        findset(n-1,sub);
    }
    public static void main(String[] args){
        ArrayList<Integer>sub=new ArrayList<>();
        int n=4;
        findset(n,sub);
    }
}
