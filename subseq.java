public class subseq {

    public static void sub(String str, int idx, String newstr){

        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(idx);

        //add currchar and subsequence
        sub(str, idx+1, newstr+currchar);

        //without currchar and subsequence
        sub(str, idx+1, newstr);

    }

    public static void main(String[] args){
        String str="abc";
        String newstr="";

        sub(str,0,newstr);
    }
}
