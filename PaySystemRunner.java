public class PaySystemRunner {
    public static void main(String[] args){
        //Initialize Paysystem
        PaySystem poly = new PaySystem();


        //Add Students
        poly.addStudent("Kyan");
        poly.addStudent("Emilio");
        poly.addStudent("Hudson");

        //Add funds
        poly.addFunds(1,"2/17",20);
        poly.addFunds(2,"2/17",13);

        //Charge lunch
        poly.chargeSpecificLunch(1,"2/4");
        poly.chargeSpecificLunch(2,"2/7");
        poly.chargeSpecificLunch(2,"2/15");
        poly.chargeSpecificLunch(3,"2/27");

        //Show Negative Balances
        poly.showNegativeBalances("2/24");

        //Show Transaction By Day
        //poly.showTransactionByDay("2/4");
        
        //Display Students
        poly.displayStudents(3);

        //


    }
}
