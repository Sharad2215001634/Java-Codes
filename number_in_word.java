import java.util.Scanner;
public class number_in_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String sr = sc.nextLine();
        char ch;
        int alph=0;
        
            for (int i = 0; i< sr.length(); i++)
            {
                ch = sr.charAt(i);
			    if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				    alph++;
            }
            else   {
                System.out.println("Wrong input");
            }
        }
        System.out.print("Here is total number of word in String : " +alph);
    }
}

