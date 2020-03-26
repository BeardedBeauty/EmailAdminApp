package email;
import java.util.Scanner;

public class Email {
    private String fname;
    private String lname;
    private String password;
    private String department;
    private int capacity;
    private String altEmail;
    Scanner input = new Scanner(System.in);

    public Email(String fname, String lname) {
        this.fname=fname;
        this.lname=lname;
        System.out.println(this.fname + this.lname);
        this.department=setdept();
        System.out.println(this.department);
    }

    private String setdept() {
        System.out.println("enter department\n1 for sales, \n2 for accounting, \n3 for development, \n0 for none");
        int dept = input.nextInt();
        if (dept == 1) { return "Sales"; }
        else if (dept == 2) { return "Accounting"; }
        else if (dept == 3) { return "Development"; }
        else if (dept == 0) { return "None"; }
        else { return "none"; }
    }
}