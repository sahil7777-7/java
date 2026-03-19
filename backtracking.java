public class backtracking {
    public static void printpem(String str, String prem, int idx){
        if(str.length()==0){
            System.out.println(prem);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currchar=str.charAt(i);
            String newstr= str.substring(0, i)+str.substring(i+1);
            printpem(newstr,prem+currchar,idx+1);
        }
    }
    public static void main(String[] args){
        String a="ABC";
        String b="";
        printpem(a,b,0);
    }
}
