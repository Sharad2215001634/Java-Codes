import java.util.Scanner;
public class sum_of_twoarray{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a,b;
        int sum = 0;
        System.out.print("Enter the Rows : ");
        a=sc.nextInt();
        System.out.print("Enter the Colmun : ");
        b = sc.nextInt();
        int c[][] = new int[a][b];
        System.out.print("Enter the Values  : ");
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                c[i][j]=sc.nextInt();
                sum = sum+c[i][j];
            }
        }
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j<b; j++)
            {
                System.out.print(c[i][j]);
            }
            System.out.printf("\n");

        }
        System.out.println(sum);

    }

}