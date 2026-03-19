public class stringpremutation {
    public static void printstring(String str, String a){

        if(str.equals("")){
            System.out.println(a);
            return;
        }
        for (int i=0;i<str.length();i++){

            char ch=str.charAt(i);
            String left=str.substring(0,i);
            String right=str.substring(i+1);
            String newstr=left+right;
            printstring(newstr,a+ch);
        }
    }
    public static void main(String[] args){
        String str="abc";
        String a="";
        printstring(str,a);
    }
}
