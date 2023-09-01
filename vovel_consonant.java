import java.util.Scanner;
import java.util.*;
public class vovel_consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alphabte : ");
        char c = sc.next().charAt(0);
        switch(c)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println("Vowel" +c);
            break;
            default:
            {
                System.out.println("Consonant "+c);
            }



        }

    }
    
}