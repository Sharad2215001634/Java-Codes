public class abcd {
    int rollNo;
    String Name;
    float Marks;
    abcd(int rollNo, String Name ){
        this.rollNo = rollNo;
        this.Name= Name;
    }
    abcd(int rollNo, String Name , float Marks){
        this(rollNo, Name);
        this.Marks= Marks;
    }
    void display(){
        System.out.println(rollNo+" "+Name+" "+Marks);
    }
    public static void main(String[] args) {
        abcd A =new abcd(57, "Sharad",99.8f);
        abcd B = new abcd(60, "Shwet", 99.3f);
        A.display();
        B.display();
    }

}