package variables_and_conditionals;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {
	public static void main(String[] args) {
		int random;
		Random ran = new Random();
		random = ran.nextInt(100);
		System.out.println();
		if (random == 100) {
			JOptionPane.showMessageDialog(null, "Yes");
		}
		
		
		for (int i = 0; i < 100; i++) {
			String ans = JOptionPane.showInputDialog("Guess my number");
			int guess = Integer.parseInt(ans);
		if (guess > random) {  JOptionPane.showMessageDialog(null, "it's too high"); }
		else if (guess < random) { JOptionPane.showMessageDialog(null, "it's too low"); } 
		else { JOptionPane.showMessageDialog(null, "you guessed it right"); 
			i = 100;}
		
		}
			

		
			

		

}
}



