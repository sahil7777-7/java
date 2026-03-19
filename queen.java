public class queen {
    public static void main(String[] args){
        int n=4;
        char [][] boards= new char[n][n];
        for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
              boards[i][j]='X';

          }

        }
        nqueen(boards,0);
    }

    public static void nqueen(char[][] boards, int row) {
        int n=boards.length;
        if(n==row){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(boards[i][j]);

                }
                System.out.println();


            }
            System.out.println("\n");
            return;

        }
        for(int i=0;i<n;i++){
            if(issafe(boards,row,i)){
                boards[row][i] ='Q';
                nqueen(boards,row+1);
                // backtracking
                boards[row][i] ='X';
            }
        }
    }

    private static boolean issafe(char[][] boards, int row, int col) {
        int n= boards.length;
        int i=row-1;

        while (i>=0){
            if(boards[i][col]=='Q'){
                return false;
            }
            i--;
        }

        i=row-1;
        int j=col+1;
        //north east dir(uthar and purav)
        while (i>=0 && j<n){
            if(boards[i][j]=='Q'){
                return false;
            }
            i--;
            j++;
        }
        //west north dir(pachim and uthar)
        i=row-1;
        j=col-1;
        while (i>=0 && j>=0){
            if(boards[i][j]=='Q'){
                return false;
            }
            i--;
            j--;
        }

        return true;
    }
}
