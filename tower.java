public class tower {
    public static void towerofhonoi (int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("transfar disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerofhonoi(n-1, src, dest, helper);
        System.out.println("transfar disk "+n+" from "+src+" to "+dest);
        towerofhonoi(n-1, helper, src, dest);

    }
    public static void main(String[] args){
        int n=3;
        towerofhonoi(n,"s","h","d");
    }
}
