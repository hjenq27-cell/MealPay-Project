
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

    public void chargeSpecificLunch(int idNo){
        for(int i = 0; i < Students.size(); i++){
            Student s = Students.get(i);
            if(s.getID() == idNo){
                s.charge_lunch();
            }
        }

    }

    public showNegativeBalances(){

    }

    public showTransactionByDay(){

    }

    public displayStudent(idNo){

    }

    public toString(){

    }

}