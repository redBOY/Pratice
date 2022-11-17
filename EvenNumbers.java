package LogicalProgramsPratice;
import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size");
        int n = scan.nextInt();
        System.out.println("enter the elements");
        for(int i=1;i<=n;i++) {
            if(i%2==0){
                System.out.println(i);

            }
        }
    }
}
