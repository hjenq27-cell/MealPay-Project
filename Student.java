import java.util.ArrayList;
public class Student{
    public String name;
    public int ID;
    public double balance;
    public ArrayList <Transaction>Transactions;
    private static int ID_Gen = 0;
    
    public Student(String myname){
        name = myname;
        ID = ID_Gen;
        ID_Gen++;
    }
    
    























    
}