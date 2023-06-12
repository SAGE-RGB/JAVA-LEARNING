import java.util.Scanner;

public class functions{
    public static void printMyName(String name ){
            System.out.println("Hello " +name);
            return;
    }
    public static int sumOfTwoNumbers(int a , int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your name is :- ");
        String name = sc.next();
        printMyName(name);
        System.out.print("print first number :- ");
        int a = sc.nextInt();
        System.out.print("print second number :- ");
        int b = sc.nextInt();
        System.out.print("THe sum of two no. are "+sumOfTwoNumbers(a, b));
        sc.close();
    }

}  

