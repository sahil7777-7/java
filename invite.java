public class invite {
    public static int callback(int n){

        if(n<=1){
            return 1;
        }
        int way1=callback(n-1);
        int way2=(n-1)*callback(n-2);

        return way1+way2;
    }
    public static void main(String[] args){
        int n=4;
        System.out.println(callback(n));
    }
}
