public class ratmaze {
    public static int maza(int startR, int startC, int endR, int endC){

        if(startR>endR||startC>endC){
            return 0;
        }
        if(startR==endR && startC==endC){
            return 1;
        }
        int way1=maza(startR+1,startC,endR,endC);
        int way2=maza(startR,startC+1,endR,endC);
        int total=way1+way2;
        return total;
    }
    public static void main(String[] args){
        int startR=1;
        int startC=1;
        int endR=4;
        int endC=4;

        System.out.println(maza(startR,startC,endR,endC));
    }
}
