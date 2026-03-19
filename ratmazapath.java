public class ratmazapath {
    public static void path(int startR, int startC, int endR, int endC,String a){

        if(startR>endR||startC>endC){
            return;
        }
        if(startR==endR && startC==endC){
            System.out.println(a);
            return;
        }
        //right
        path(startR+1,startC,endR,endC,a+"R");
        //down
        path(startR,startC+1,endR,endC,a+"D");

    }
    public static void main(String[] args){
        int startR=0;
        int startC=0;
        int endR=4;
        int endC=4;
        String a="";
        path(startR,startC,endR,endC,a);

    }
}

