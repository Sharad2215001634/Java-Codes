import java.util.*;
import java.util.Scanner;
public class method {
    void sum(int a , int b){
        System.out.print("Sum of A+B : ");
        System.out.println(a+b);
    }
    static void area_of_circle(double r){
        System.out.println("Area of circle is : "+3.14*r*r);
    }
    static void rect(int l, int b){
        System.out.println("Area of rectangle : "+l*b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<<<<------------ We are going to print Area of circle ----------->>>>");
        System.out.print("Enter the value of radius : ");
        double d = sc.nextDouble();
        area_of_circle(d);
        System.out.println("<<<<------------ We are going to Print Sum of two number  ----------->>>>");
        method h = new method();
        System.out.print("Enter the first number : ");
        int c = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int e = sc.nextInt();
        h.sum(c,e);
        System.out.println("<<<<------------ We are going to print Area of rectangle ----------->>>>");
        System.out.print("Enter the Length : ");
        int le = sc.nextInt();
        System.out.print("Enter the Width  : ");
        int we = sc.nextInt();
        rect(le,we);
        System.out.print("Thankyou for Using me ");
    }

}
