import java.util.Scanner;
public class positive_negative {
    public static void main(String [] arg)
    {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Enter the number : ");
        a = sc.nextInt();
        if(a < 0)
        {
            System.out.print("Negative number ");
        }
        else if (a>0)
        {
            System.out.print("Positive number ");
        }
        else 
        {
            System.out.print("Number is ZERO");
        }
    }
    
}
