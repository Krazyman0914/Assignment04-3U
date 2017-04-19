
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bisef5371
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;
        int number4;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter in 4 numbers on separate lines");
        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();
        number4 = input.nextInt();
        System.out.println("Your numbers were " + number1 + ", " + number2 + ", " + number3 + ", and " + number4);
    }
}