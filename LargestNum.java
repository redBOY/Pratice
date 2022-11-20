package Pratice;
import java.util.Scanner;

public class LargestNum {
        public static void main(String[] args) {
                int N,max;
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter the size");
                N = scan.nextInt();
                int[] a = new int[N];
                System.out.println("enter the elements");
                for (int i = 0; i < N; i++) {
                        a[i] = scan.nextInt();
                }
                max = a[0];
                for (int i = 0; i < N; i++) {
                        if (max < a[i]) {
                                max = a[i];
                        }
                }
                System.out.println("Max value is" + max);
        }
}