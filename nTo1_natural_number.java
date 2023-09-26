import java.util.Scanner;
public class nTo1_natural_number {
    public static void main(String[] arg)
    {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(n>=1)
        {
            System.out.println(n);
            n--;
        }


    }
    
}
