public class move {

    public static void movestr(String str, int idx, String newstr, int count){

        if(idx==str.length()){
            for(int i=1;i<=count;i++){
                newstr=newstr+'X';
            }
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(idx);
        if(currchar=='x'){
            count++;
            movestr(str,idx+1,newstr,count);
        }
        else {
            newstr+=currchar;
            movestr(str,idx+1,newstr,count);
        }
    }
    public static void main(String [] args){
        String str="anxnsaxnbxhxxh";
        String newstr="";
        int count=0;
        int idx=0;

        movestr(str,0,newstr,0);



    }
}
