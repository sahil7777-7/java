public class duplicate {
    public static void remove(String str, String newstr, int idx){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char curr=str.charAt(idx);
        if(newstr.indexOf(curr)==-1){
            newstr+=curr;
        }
        remove(str,newstr,idx+1);
    }
    public static void main(String[] args){
        String str="progmmimng";
        String newstr="";
        int idx=0;
        remove(str,newstr,idx);
    }
}
