import java.util.Scanner;

class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean a= true;
        while (a) {
            System.out.println("Press --> \n '+' for addition \n '-' for subtract \n '*' for multiplication \n '/' for division ");
            String choice = sc.nextLine();
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if (choice.equals("+")){
                int sum = num1+num2;
                System.out.print("The sum is : ");
                System.out.println(sum);
            }
            else if (choice.equals("-")){
                if (num1>num2){
                    int diff=num1-num2;
                    System.out.print("The diffrance is : ");
                    System.out.println(diff);
                }
                else{
                    int diff2 = num2-num1;
                    System.out.print("The difference is : ");
                    System.out.println(diff2);
                }
            }
            else if (choice.equals("*")){
                int prod=num1*num2;
                System.out.print("The product is : ");
                System.out.println(prod);
                }
                
            else if (choice.equals("/")){
                int div=num1/num2;
                System.out.print("The quotient is : ");
                System.out.println(div);
            } 
            else {
                System.out.println("Invalid choice ");
            }
        }
        sc.close();
    }
}
