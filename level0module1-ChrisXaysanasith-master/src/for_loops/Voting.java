package for_loops;

import javax.swing.JOptionPane;

import org.omg.Messaging.SyncScopeHelper;

public class Voting {
	public static void main(String[] args) {
		String vote1 = JOptionPane.showInputDialog("How many people will enter the voting?");

		int ans = Integer.parseInt(vote1);
		int trump = 0;
		int bill = 0;
		if (trump > bill) {

		}
		for (int i = ans; i > 0; i--) {
			String vote = JOptionPane.showInputDialog("Who are you voting for?");

			if (vote.equals("bill")) {
				bill++;

			}
			if (vote.equals("trump")) {
				trump++;

			}

		}
		if (trump > bill) {
			JOptionPane.showMessageDialog(null, "Trump wins!");
		} else if (bill > trump) {
			JOptionPane.showMessageDialog(null, "Bill wins!");
		}
	}
}
