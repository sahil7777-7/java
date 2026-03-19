public class stringrev {

    public static void reverse(String str, int n) {
        if (n < 0) {
            return;
        }
        System.out.print(str.charAt(n));
        reverse(str, n - 1);
    }

    public static void main(String[] args) {
        String str = "sahil";
        int n = str.length() - 1;
        reverse(str, n);
    }
}
