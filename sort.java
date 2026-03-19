public class sort {
    public static boolean checkarr(int[] arr,int n){
        int size=arr.length-1;
        if(n==size){
            return true;
        }
        if(arr[n] >= arr[n+1]){
            return false;
        }
        else {
            return checkarr(arr,n+1);
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,4,5};
        System.out.println(checkarr(arr,0));
    }
}
