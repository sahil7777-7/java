package app;

import java.util.Random;

class Account{
    String name;
    String email;
    int age;
    int phone_number;
    Random r = new Random();
    long accNo = 1000000000L + r.nextInt(900000000);


    public Account(String name,int age,String email,int phone_number ) {
        this.phone_number = phone_number;
        this.age = age;
        this.email = email;
        this.name = name;

    }


    public void printifo(){
        System.out.print("\nyour name: "+name);
        System.out.print("\nyour Age: "+age);
        System.out.print("\nyour email: "+email);
        System.out.print("\nyour phone number: "+phone_number);
        System.out.print("\nYour account number is: "+accNo);

    }
}
