import java.util.*;
import java.util.Scanner;
public class even_odd_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = 0;
        System.out.print("Enter the Number : ");
        n = sc.nextInt();
        switch(n % 2)
        {
            case 0:
                System.out.println("You entered the number : "+n);
                System.out.println("You entered a EVEN number");
                break;
            case 1:
            System.out.println("You entered the number : "+n);
                System.out.println("You entered a ODD number");
                break;
        }

    }
    
}
