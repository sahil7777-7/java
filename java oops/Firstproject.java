import java.util.*;

class Student {
    int rollNo;
    String name;
    int standard;

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + rollNo);
        System.out.println("Class: " + standard);
    }

    Student() {

        System.out.println("Sigma university");
    }
}

class Firstproject {
    public static void main(String[] args) {

        boolean run = true;
        while (run) {
            System.out.println("1) Start: ");
            System.out.println("2) Exit: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if (choice == 2) {
                run = false;
                System.out.println("Exiting...");
                break;
            }
            System.out.println();
            System.out.print("How many students to add: ");
            int n = sc.nextInt();
            sc.nextLine();
 

            Student[] students = new Student[n];

            for (int i = 0; i < n; i++) {

                students[i] = new Student();

                System.out.println("\nStudent " + (i + 1));

                System.out.print("Name: ");
                students[i].name = sc.nextLine();

                System.out.print("Roll no: ");
                students[i].rollNo = sc.nextInt();

                System.out.print("Class: ");
                students[i].standard = sc.nextInt();
                sc.nextLine();
            }

            System.out.println("\n Student List ");

            for (Student s : students) {
                s.print();
                System.out.println();
            }
        }
    }
}
