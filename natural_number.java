import java.util.Scanner;
public class natural_number {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(+i);
        }
    }
}