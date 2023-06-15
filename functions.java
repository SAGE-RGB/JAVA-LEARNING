import java.util.Scanner;

public class functions{
    public static void printMyName(String name ){
            System.out.println("Hello " +name);
            return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your name is :- ");
        String name = sc.next();
        printMyName(name);
        sc.close();
    }

}  

