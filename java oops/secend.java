class student_class{
    String name;
    int roll_no;
    String sub;

    public void printinfo(){
        System.out.println("Student name is "+this.name);
        System.out.println("Student roll no is "+this.roll_no);
        System.out.println("Student subject is "+this.sub);

    }
//    student_class(){
//        System.out.println("constructor called");
//    }
//    student_class(String a, int b, String c){
//        this.name=a;
//        this.roll_no=b;
//        this.sub=c;
//    }

    student_class(student_class s2){
        this.name=s2.name;
        this.roll_no=s2.roll_no;
        this.sub=s2.sub;
    }
    student_class(){}

}
public class secend {

    public static void main(String[] args){
        student_class s1=new student_class();
        s1.name="sahil";
        s1.roll_no=2;
        s1.sub="Maths";
//        s1.printinfo();
        student_class s2=new student_class(s1);
        s2.printinfo();
    }
}
