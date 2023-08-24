import java.util.Scanner;
public class method2 {
    static void table(int no)
    {
        for (int i = 1; i<=10; i++)
        {
            System.out.print(i*no+" ");
        }
    }
    static void factorial(int nu)
    {
        int fact=1;
        for(int j = 1; j <= nu; j++)
        {
            fact=fact*j;

        }
        System.out.print(""+fact);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int t = sc.nextInt();
        table(t);
        System.out.print("\nEnter the number : ");
        int u = sc.nextInt();
        table(u);
        System.out.print("\nEnter the number : ");
        int nu = sc.nextInt();
        factorial(nu);
    }
}



