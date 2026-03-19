import java.util.*;
public class min {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int cols=sc.nextInt();
        int[][]numbers=new int[row][cols];
        for(int i=0;i<row;i++){
            for (int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }

        int min=numbers[0][0];
        for(int i=0;i<row;i++){
            for (int j=0;j<cols;j++){
                if(min>numbers[i][j]){
                    min=numbers[i][j];
                }
            }
        }
        System.out.println("min= "+min);
    }
}
