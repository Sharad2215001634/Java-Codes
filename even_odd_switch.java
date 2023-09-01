import java.util.*;
import java.util.Scanner;
public class even_odd_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        switch(n % 2)
        {
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("Odd");
                break;
        }

    }
    
}
