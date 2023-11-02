class fin
{
    int a = 5;
    final int b = 10;
    void get()
    {
        a=a+5;
        System.out.println(a+b);

    }
}
public class finall{
public static void main(String[] args) {
        fin h = new fin();
        h.get();
    }
}
