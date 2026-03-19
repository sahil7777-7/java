public class path {
    public static int placepath(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        int verpath=placepath(n-m ,m);
        int horpath=placepath(n-1,m);
        return verpath+horpath;

    }
    public static void main(String[] args){
        int a=4,b=2;
        System.out.println(placepath(a,b));
    }
}
