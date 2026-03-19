public class linnerser {
    public static int search(int[]arr, int target, int idx){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==target){
            return idx;
        }
        else {
            return search(arr,target,idx+1);
        }
    }
    public static void main(String [] args){
        int[] arr={2,4,1,7,5,3,9};
        int idx=0;
        int target=5;
        System.out.println("Target index: "+search(arr,target,idx));
    }
}
