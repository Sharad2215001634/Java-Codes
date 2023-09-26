import java.util.Scanner;
public class add_two_string {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Name : ");
        String first_name = sc.next();
        System.out.print("Enter the Last Name : ");
        String last_name = sc.next();
        String sir = "Hello sir my name is Sharad kumar singh and i am from varanasi";
        String full_name = first_name + last_name;
        System.out.println(full_name);
        System.out.println("Size of Your name is : "+full_name.length());
        System.out.println("This is the Upper case of Your Name : "+full_name.toUpperCase());
        System.out.println("This is the Lower case of your Name : "+full_name.toLowerCase());
        System.out.println(sir.indexOf("Sharad"));
        System.out.println(sir.length());
        
    }
    
}   
