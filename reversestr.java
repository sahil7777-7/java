import java.util.Scanner;

public class reversestr {
    public static void revers(String str, int idk){
        if(idk==0){
            System.out.print(str.charAt(idk));
            return;
        }
        System.out.print(str.charAt(idk));
        revers(str, idk - 1);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str=sc.nextLine();
        int idk=str.length()-1;
        revers(str,idk);
    }
}
