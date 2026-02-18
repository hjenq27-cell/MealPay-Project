import java.util.ArrayList;

public class PaySystem{

    private ArrayList<Student> students = new ArrayList<>();
    
    public void addStudent(String name){
        students.add(new Student(name));
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

    public void chargeSpecificLunch(int idNo, String date){
        for(int i = 0; i < students.size(); i++){
            Student s = students.get(i);
            if(s.getID() == idNo){
                s.charge_lunch(date);
                return;
            }
        }
    }

    public void showNegativeBalances(String date){
        for(int i = 0; i < students.size();i++){
            Student s = students.get(i);

            ArrayList<Transaction>myTrans = s.getTransactions();
            
            for(int j = 0; j < myTrans.size(); j++){
                Transaction myDate = myTrans.get(j);
                
                if((myDate.getDate()).equals(date)){
                    System.out.println("(" + myDate + ")" + " by " + s.getName() + " ID: " + s.getID());
                    break;
                }

            }
        }



    }

    public void showTransactionByDay(String date){
    for (Student s : students) {
        s.TransactionsByDate(date);
    }
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