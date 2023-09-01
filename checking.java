import java.util.*;
import java.util.Scanner;
public class checking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,c;
        System.out.print("Enter the number : ");
        n= sc.nextInt();
        c=(n>0)?1:(n<0)?2:3;
        switch(c){
            case 1:
            System.out.print("Positive Number");
            break;

        case 2:
            System.out.print("Negative Number");
            break;

        default:
            System.out.print("Zero");
        }

    }
    
}
