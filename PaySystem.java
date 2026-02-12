import java.util.ArrayList;

public class PaySystem{

    private ArrayList<Student> students = new ArrayList<>();
    
    public void addStudent(String name){
       
    }

<<<<<<< HEAD
    public boolean addFunds(int idNo, String date, double amount){
        //loop through each student, find the student with matchin ID, add amount
        for(Student s: students){
            if(s.getID() == idNo){
                s.makeCharge(date, amount);
                return true;
=======
    public addFunds(idNo, amount){

    }

    public void chargeSpecificLunch(int idNo, String date){
        for(int i = 0; i < Students.size(); i++){
            Student s = Students.get(i);
            if(s.getID() == idNo){
                s.charge_lunch(date);
>>>>>>> kyan
            }
        }
            return false;

    }

<<<<<<< HEAD
    public void chargeLunch(int idNo){
    
    }

    public void showNegativeBalances(){
=======
    public void showNegativeBalances(String date){
        for(int i = 0; i < Students.size();i++){
            Student s = Students.get(i);
            Transaction myTrans = s.getTransactions(i);
            for(int j = 0; j < myTrans.size(); j++){
                Transaction date = myTrans.get(i);
                if((myDate.getDate).equals(date)){
                    System.out.println("(" + myDate + ")" + " by " + s.getName() + " ID: " + s.getID());
                }

            }
        }


>>>>>>> kyan

    }

    public void showTransactionByDay(){

    }

    public void displayStudent(int idNo){
        for(Student s : students){
            if(s.getBalance()<0){
                System.out.println(s);
            }
        }
    }

    public String toString(){
        return null;
    }

}