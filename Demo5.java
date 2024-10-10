import java.util.Scanner;

public class Demo5 {    
    public static void main(String[] args) {

        Scanner divyansh = new Scanner(System.in);
        System.out.println("Please enter your name");
        String n1 = divyansh.nextLine(); // String
        System.out.println("The entered name is " + n1);
        System.out.println("Please enter your salary");
        int s1 = divyansh.nextInt(); // int
        System.out.println("The entered salary is " + s1);

    }
}
