public class pathfind {
    public static int path(int i,int j, int n, int m){
        if(i==n||j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }

        // move downpath
        int downpath=path(i+1,j,n,m);
        // move rightpath
        int rightpath=path(i,j+1,n,m);
        // total path
        int total=downpath+rightpath;
        return total;
    }
    public static void main(String[] args){
        int n=3;
        int m=3;
        System.out.print(path(0,0,n,m));
    }
}
