public class targetlist {
    public static void list(int [] arr, int idx, int target, int n, int[]a){

        if(idx==arr.length){
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
            return;
        }
        if (arr[idx]==target) {
            a[n]=idx;
            list(arr,idx+1,target,n+1,a);
        }
        else{
            list(arr,idx+1,target,n,a);
        }

    }
    public static void main(String[] args){
        int [] arr={2,3,6,7,2,4,2};
        int idx=0;
        int target=2;
        int n=0;
        int[] a= new int[arr.length];
        list(arr,idx,target,n,a);
    }
}
