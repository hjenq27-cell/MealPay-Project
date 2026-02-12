public class PaySystemRunner {
    public static void main(String[] args){
        //Initialize Paysystem
        PaySystem poly = new PaySystem();


        //Add Students
        poly.addStudent("Kyan");
        poly.addStudent("Emelio");
        poly.addStudent("Hudson");

        //Add funds
        poly.addFunds(1,20);
        poly.addFunds(2,13);

        //Charge lunch
        poly.chargeLunch(1);
        poly.chargeLunch(2);
        poly.chargeLunch(2);
        poly.chargeLunch(3);

        //Show Negative Balances
        poly.showNegativeBalances();

        //Show Transaction By Day
        //poly.showTransactionByDay("2/4");
        
        //Display Students
        poly.displayStudents();

        //


    }
}
