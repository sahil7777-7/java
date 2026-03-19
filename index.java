public class index {
    static int first=-1;
    static int last=-1;
    public static void print(String str, int idx, char el){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curr=str.charAt(idx);
        if(curr==el){
            if(first==-1){
                first=idx;
            }
            else{
                last=idx;
            }
        }
        print(str,idx+1,el);
    }
    public static void main(String[] args){
        String name="gdhnabehgxgahxsgystgjx";
        char el='g';
        print(name,0,el);
    }
}
