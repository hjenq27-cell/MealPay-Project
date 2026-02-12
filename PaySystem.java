
import java.util.ArrayList;
public class PaySystem{
    private ArrayList<Student>Students;

    public PaySystem(){
        Students = new ArrayList<Student>();

    }

    public void addStudent(String name){
        Student s = new Student(name);
        Students.add(s);
    }

    public addFunds(idNo, amount){

    }

    public void chargeSpecificLunch(int idNo, String date){
        for(int i = 0; i < Students.size(); i++){
            Student s = Students.get(i);
            if(s.getID() == idNo){
                s.charge_lunch(date);
            }
        }

    }

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



    }

    public showTransactionByDay(){

    }

    public displayStudent(idNo){

    }

    public toString(){

    }

}