
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bisef5371
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int inches;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the measurement in inches you wish to convert");
        inches = input.nextInt();
        double centimeters = (inches * 2.54);
        System.out.println(inches + " inches is the same as " + centimeters + "cm");

    }
}