class student{
        String name;
        int age;

//      student(){//  Non-Parameterized constructor
//            System.out.println("sigma university");
//      }

        student(String name,int age){//Parameterized constructor
            this.name=name;
            this.age=age;
        }
        public void printName(){
            System.out.println("my name is "+this.name);
        }
        public void printAge(){
            System.out.println("my age is "+this.age);
        }


}
public class OOPS1 {
    public static void main(String[] args){

        student s1=new student("sahil",19);


//        student s1=new student();
//        s1.name="jeet";
//        s1.age=19;
//
//        student s2=new student();
//        s2.name="tushar";
//        s2.age=18;
//
        s1.printName();
        s1.printAge();
//
//        s2.printName();
//        s2.printAge();

    }
}
