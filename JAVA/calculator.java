import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int ans = 0;
        // here we take an infinte while loop
        while (true) {
            
            System.out.print("Choose an operator: ");
            
            //now we'll take a character input from the user
            char op = in.next().trim().charAt(0);
            
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    ans = num1 / num2;
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X' ) {
                break;
            } else {
                System.out.println("Invalid Operations!!!");
            }
            System.out.println(ans);
        }
    }
}
