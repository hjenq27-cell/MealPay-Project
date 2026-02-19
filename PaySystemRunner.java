public class PaySystemRunner {
    public static void main(String[] args){
        //Initialize Paysystem
        PaySystem poly = new PaySystem();


        //Add Students
        System.out.println("Adding Students...");
        System.out.println("");
        poly.addStudent("Kyan");
        poly.addStudent("Emilio");
        poly.addStudent("Hudson");

        //Add funds
        System.out.println("Adding Funds...");
        System.out.println("");
        poly.addFunds(1,"2/17",20);
        poly.addFunds(2,"2/17",13);

        //Charge lunch
        System.out.println("Charging Lunch...");
        System.out.println("");
        poly.chargeSpecificLunch(0,"2/4");
        poly.chargeSpecificLunch(1,"2/4");
        poly.chargeSpecificLunch(2,"2/4");
        poly.chargeSpecificLunch(1,"2/7");
        poly.chargeSpecificLunch(1,"2/17");
        poly.chargeSpecificLunch(2,"2/27");

        //Show Negative Balances
        System.out.println("Students with Negative Balances:");
        poly.showNegativeBalances("2/27");
        System.out.println("");

        //Show Transaction By Day
        System.out.println("Showing transactions on 2/17:");
        poly.showTransactionByDay("2/17");
        
        //Display Students
        System.out.println("Displaying Students:");
        poly.displayStudent(1);
        poly.displayStudent(2);

        //


    }
}
