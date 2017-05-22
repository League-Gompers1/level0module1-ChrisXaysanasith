package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

        // 1. Save the superpower for each person in a variable.
String chris= "math";
String daniel = "hacking";
String ebuka = "endurance";
String christopher = "reading";
String jesus = "speed";
String jason = "smarts";
String alfredo = "gaming";
String joshua = "inspiration";
        // 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog("Enter your name");
        // 3. Show the superpower in a pop-up, depending on the name entered. 
if (name.equals("daniel")) {
	JOptionPane.showMessageDialog(null, "Daniel's superpower is "+daniel);
} else if (name.equals("chris")) {
	JOptionPane.showMessageDialog(null, "Chris's superpower is "+chris);
}else if (name.equals("ebuka")) {
	JOptionPane.showMessageDialog(null, "Ebuka's superpower is "+ebuka);
}else if (name.equals("Christopher")) {
	JOptionPane.showMessageDialog(null, "Christopher's superpower is "+christopher);
}else if (name.equals("jesus")) {
	JOptionPane.showMessageDialog(null, "Jesus's superpower is "+jesus);
}else if (name.equals("alfredo")) {
	JOptionPane.showMessageDialog(null, "Alfredo's superpower is "+alfredo);
}else if (name.equals("joshua")) {
	JOptionPane.showMessageDialog(null, "Joshua's superpower is "+joshua);	
	








}
}
}