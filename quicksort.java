public class quicksort {
    public static void main(String[] args){
        int[] arr={4,2,5,7,1,9,8};
        int n=arr.length-1;

        quick(arr,0,n);
        for (int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void quick(int[] arr, int low, int high) {
        int pivot = 0;
        if (low < high) {
            pivot = partition(arr, low, high);
            quick(arr, low, pivot - 1);
            quick(arr, pivot + 1, high);
        }

    }

    private static int partition(int[] arr, int low, int high) {
        int pivot=arr[high];
        int i=low-1;
        for (int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }
}
