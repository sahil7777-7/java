public class arraysort {
    public static boolean sort_array(int[] arr,int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]>=arr[idx+1]){
            return false;
        }
        else {
            return sort_array(arr,idx+1);
        }

    }
    public static void main(String[] args){
        int []arr={1,4,11,16};
        int idx=0;
        System.out.println(sort_array(arr,idx));
    }
}
