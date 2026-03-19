public class permutations {

    public static void perm(String str, String newstr){
        if(str.length()==0){
            System.out.println(newstr);
            return;
        }
        for (int i=0;i<str.length();i++){
            char corrchar=str.charAt(i);

            String pstr=str.substring(0,i)+str.substring(i+1);
            perm(pstr,newstr+corrchar);
        }
    }

    public static void main(String[] args){
        String str="abc";
        String newstr="";
        perm(str,newstr);
    }
}
