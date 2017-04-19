
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bisef5371
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREATING INTEGER FOR FOOD
        int foodcost;
        //CREATING INTEGER FOR DJ
        int DJcost;
        //CREATING INTEGER FOR HALL RENTAL
        int hallrental;
        //CREATING INTEGER FOR DECOR
        int decorcost;
        //CREATING INTEGER FOR STAFFING
        int staffcost;
        //CREATING INTEGER FOR MISCILLANIOUS
        int misccost;
        //CREATING INTEGER FOR TOTAL
        int totalcost;
        //CREATING INTEGER FOR TICKETS
        int ticketcost;
        int totaltickets;
        Scanner input = new Scanner(System.in);
        ticketcost = 35;
        System.out.print("How much does the food for prom cost? ");
        foodcost = input.nextInt();
        System.out.print("How much does the DJ cost? ");
        DJcost = input.nextInt();
        System.out.print("How much does it cost to rent the hall? ");
        hallrental = input.nextInt();
        System.out.print("How much does decorations cost? ");
        decorcost = input.nextInt();
        System.out.print("How much does it cost for staff? ");
        staffcost = input.nextInt();
        System.out.print("How much for miscellaneous costs? ");
        misccost = input.nextInt();
        totalcost = foodcost + DJcost + hallrental + decorcost + staffcost + misccost;
        totaltickets = totalcost / ticketcost;
        System.out.println("The total cost is $" + totalcost + ". You will need to sell " + totaltickets + " tickets to break even.");

    }
}
