public class arraycheck {
    public static boolean check(int[] arr, int n) {

        // base case: last element reached
        if (n == arr.length - 1) {
            return true;
        }

        // agar current element next se bada hai
        if (arr[n] > arr[n + 1]) {
            return false;
        }

        // baaki array check karo
        return check(arr, n + 1);
    }

    public static void main(String[] args){
        int[] arr={1,2,3,4};
        int n=arr.length-1;
        System.out.println(check(arr,n));
    }
}
