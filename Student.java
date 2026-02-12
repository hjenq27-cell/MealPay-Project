import java.util.ArrayList;
public class Student{
    private String name;
    private int ID;
    private double balance;
    private ArrayList <Transaction> Transactions;
    private static int ID_Gen = 0;
    
    
    public Student(String myname){
        name = myname;
        ID = ID_Gen;
        ID_Gen++;
        balance = 0;
        Transactions = new ArrayList<Transaction>();
    }

    public ArrayList<Transaction> getTransactions() {
    return Transactions;
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

    public void charge_lunch(){
        balance -= 7;
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