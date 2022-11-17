package LogicalProgramsPraticea;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = 0, num2 = 1, num3;
        System.out.println("Enter the size ");
        int size = scan.nextInt();
        for (int i = 2; i <= size; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.println(num1+"");
        }
    }
}

