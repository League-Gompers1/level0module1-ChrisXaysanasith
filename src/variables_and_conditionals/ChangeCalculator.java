package variables_and_conditionals;

/** 
I have a pocket full of change. I hate doing math. Make me a program that will calculate 
how much money I have without me having to use my brain.
*/

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

    public static void main(String[] args) {

        // Ask the user how many nickels they have
String penny =JOptionPane.showInputDialog("How many nickles do you have?");
        // Convert their answer to an int using Integer.parseInt()
int nickels = Integer.parseInt(penny);





        // Ask the user how many dimes they have, and convert their answer
String dimes =JOptionPane.showInputDialog("How many dimes do you have?");
int dimess = Integer.parseInt(dimes);
        // Ask the user how many quarters they have, and convert their answer
String quarter =JOptionPane.showInputDialog("How many quarters do you have?");
int quarterss = Integer.parseInt(quarter);
        // Calculate how much money the user has and save it in a double variable 
double total=(nickels*1) + (dimess*1) + (quarterss*1) ;
        // Tell the user how much money they have
JOptionPane.showMessageDialog(null, total);
    }
}