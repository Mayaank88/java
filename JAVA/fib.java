import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0; //here p is previous
        int b = 1; //here i is initial
        int count = 2;
        while (count <= n) {
            int temp = b;
            b += a;
            a = temp;
            count ++;
            
        }
        System.out.println(b);

    }
}
