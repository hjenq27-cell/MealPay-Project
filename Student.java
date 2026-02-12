import java.util.ArrayList;
public class Student{
    public String name;
    public int ID;
    public double balance;
    public ArrayList <Transaction> Transactions;
    private static int ID_Gen = 0;
    
    public Student(String myname, int myid){
        name = myname;
        ID = myid;
        ID_Gen++;
        balance = 0;
        Transactions = new ArrayList<Transaction>();
    }
    
    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    public int getID(){
        return ID;
    }

    public String toString(){
        String Transaction_Print = "";
        for(int i = 0; i < Transactions.size(); i++){
            Transaction purchase = Transactions.get(i);
            Transaction_Print += "( " + purchase + "), ";
        }
        return "Name: " + name + " ID: " + ID + " Balance: " + balance + " Transactions: " + Transaction_Print;
    }

    























    
}