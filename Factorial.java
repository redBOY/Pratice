package LogicalPrograms;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scan.nextInt();
        int factorial=1;
        for(int i=1;i<=num;i++){
            factorial=factorial*i;
            System.out.println("factorial of a number is" +factorial);
        }
    }
}
