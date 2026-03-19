import java.util.*;
public class reverse_string {
    public static void main(String[] args){
        System.out.print("Enter string= ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        for(int i=sb.length()-1; i>=0;i=i-1){
            System.out.print(sb.charAt(i));
        }
    }
}
