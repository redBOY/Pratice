package LogicalProgramsPratice;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of a number ");
        int reminder,reverse=0;
        int number = sc.nextInt();
        while(number !=0)
        {
            reminder = number % 10;
            reverse = reverse*10+reminder;
            number = number/10;
        }
        System.out.println("after reverse number is \n"+reverse);
    }
}

