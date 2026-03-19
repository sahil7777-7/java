package bank;
class Account{
    public String name;
    protected String email;
    private String password;

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {

        this.password = pass;
    }
}
public class Bank {
    public static void main(String[] args){
        Account acc1=new Account();
        acc1.name="sahil kumar";
        acc1.email="kumarsahil12k4@gmail.com";
        acc1.setPassword("abcd");
        System.out.println(acc1.getPassword());
    }
}
