package Pratice;
import java.util.Scanner;

public class SmallestNum {
    public static void main(String[] args) {
        int N, min;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size");
        N = scan.nextInt();
        int[] a = new int[N];
        System.out.println("enter the elements");
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }
        min = a[0];
        for (int i = 0; i < N; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Min value is" + min);
    }
}