package LogicalPrograms;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag= false;
        System.out.println("enter the number");
        int p = scan.nextInt();
        for (int i = 2; i < p; i++) {
            if (p % i == 0) {
               flag=true;
               break;
            }
        }
            if (!flag) {
                System.out.println("given number is a prime number");
            } else {
                System.out.println("given number is not a prime number");
            }
        }
    }
