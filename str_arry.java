import java.util.*;
public class str_arry {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        sc.nextLine();
        String[]arr=new String[size];
        int sum=0;

        for(int i=0;i<size;i++){
            arr[i]=sc.nextLine();
        }
        for(int i = 0; i < size; i++){
            sum += arr[i].length();
        }
        System.out.println("sum= "+sum);

    }
}
