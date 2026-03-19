public class mergesort {
    public static void main(String [] args){
        int[] arr={4,2,9,1,5,7,8};
        int n=arr.length-1;
        divide(arr,0,n);
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void divide(int[] arr, int s, int e) {
        int mid=s+(e-s)/2;
        if(s>=e){
            return;
        }

        divide(arr,s,mid);
        divide(arr,mid+1,e);
        conquer(arr,s,mid,e);
    }

    private static void conquer(int[] arr, int s, int mid, int e) {
        int[] merge_array=new int[e-s+1];

        int idx1=s;
        int idx2=mid+1;
        int x=0;
        while (idx1<=mid && idx2<=e){
            if(arr[idx1]<=arr[idx2]){
                merge_array[x]=arr[idx1];
                x++;
                idx1++;
            }
            else {
                merge_array[x]=arr[idx2];
                x++;
                idx2++;
            }
        }
        while (idx1<=mid){
            merge_array[x]=arr[idx1];
            x++;
            idx1++;
        }
        while (idx2<=e){
            merge_array[x]=arr[idx2];
            x++;
            idx2++;
        }
        for (int i=0,j=s;i<merge_array.length;i++,j++){
            arr[j]=merge_array[i];
        }

    }
}
