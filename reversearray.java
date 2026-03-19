public class reversearray {

    public static void revese(int[] arr, int idx, int size){
        int n=arr.length/2;
        if (idx >= n) {
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]);
            }
            return;
        }
        else {
            arr[idx]=arr[idx]+arr[size];
            arr[size]=arr[idx]-arr[size];
            arr[idx]=arr[idx]-arr[size];

            revese(arr,idx+1,size-1);
        }

    }
    public static void main(String[] args){
        int[] arr={1,4,2,4,5,3};
        int size=arr.length-1;
        int idx=0;
        revese(arr,idx,size);
    }
}
