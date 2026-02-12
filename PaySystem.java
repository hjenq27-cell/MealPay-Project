import java.util.ArrayList;

public class PaySystem{

    private ArrayList<Student> students = new ArrayList<>();
    
    public void addStudent(String name){
       
    }

    public boolean addFunds(int idNo, String date, double amount){
        //loop through each student, find the student with matchin ID, add amount
        for(Student s: students){
            if(s.getID() == idNo){
                s.makeCharge(date, amount);
                return true;
            }
        }
            return false;

    }

    public void chargeLunch(int idNo){
    
    }

    public void showNegativeBalances(){

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