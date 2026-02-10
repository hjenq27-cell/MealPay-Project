public class Transaction {
    private String date;
    private double amount;

    public Transaction(String mydate, double myamount){
        date = mydate;
        amount = myamount;

    }

    public Transaction(String mydate){
        date = mydate;
        amount = -7;
    }

    public String toString(){
        return date + ", " + amount;
    }

    public String getDate(){
        return date;
    }

    public double getAmount(){
        return amount;
    }
}
