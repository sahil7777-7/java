public class sumarray {
    public static void sum(int[] arr, int idx,int add){
        if(idx==arr.length){
            System.out.println(add);
            return;
        }
        sum(arr,idx+1,add+arr[idx]);
    }
    public static void main(String[] args){
        int[] arr={1,4,2,6,4};
        int sum=0;
        int idx=0;
        sum(arr,idx,sum);
    }
}
