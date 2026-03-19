public class findoc {

    static int first = -1;
    static int last = -1;

    public static void findOcc(String str, int index, char target) {
        // base condition
        if (index == str.length()) {
            System.out.println("First occurrence: " + first);
            System.out.println("Last occurrence: " + last);
            return;
        }

        char currChar = str.charAt(index);

        if (currChar == target) {
            if (first == -1) {
                first = index;
            }
            last = index;
        }

        findOcc(str, index + 1, target);
    }

    public static void main(String[] args) {
        String str = "hdbajqyhbaxsdx";
        findOcc(str, 0, 'h');
    }
}
