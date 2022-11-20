package Pratice;
import java.util.Scanner;

public class VowelMethod {
        public static void main(String[] args) {
            int count = 0;
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the sentence");
            String str = scan.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'i' || str.charAt(i) == 'u') {
                    count++;
                    System.out.println("Number of Vowels in a given sentence is" + count);
                }
            }
        }
    }

]
        
        
        
        
        
        
