import java.util.ArrayList;

public class PaySystem{

    private ArrayList<Student> students;
    
    private static int ID_Gen = 1;

    public void addStudent(String name){
        Student newStudent = new Student(name, ID_Gen);
        ID_Gen++;
        students.add(newStudent);

    }

    public void addFunds(int idNo, int amount){
        while(true){
            
        }
    }

    public void chargeLunch(int idNo){

    }

    public void showNegativeBalances(){

    }

    public void showTransactionByDay(){

    }

    public void displayStudent(int idNo){

    }

    public String toString(){

    }

}