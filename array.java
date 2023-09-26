import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;
        System.out.println("Enter the number of Rows : ");
        a=sc.nextInt();
        System.out.println("Enter the number of Column : ");
        b=sc.nextInt();
        int c[][] = new int[a][b];
        System.out.println("Enter the values in Array : ");
        for(int i =0; i< a; i++)
            for (int j =0; j <b; j++)
                c[i][j] = sc.nextInt();
        for(int i =0; i<a; i++)
        {
            for (int j =0; j<b; j++)
            {
                System.out.print(c[i][j]);
            }
            System.out.printf("\n");
        }

    }
}
