package variables_and_conditionals;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String janurary = "capricorn";
		String feburary = "aquarius";
		String march = "pisces";
		String april = "aries";
		String may = "taurus";
		String june = "gemini";
		String july = "cancer";
		String august = "leo";
		String september = "virgo";
		String october = "libra";
		String november = "scorpio";
		String december = "sagittarius";
		String born = JOptionPane.showInputDialog(null, "What month were you born?");
		if (born.equals("janurary")) {
			JOptionPane.showMessageDialog(null, "Your horoscope is " + janurary);
		} else if (born.equals("feburary")) {
			JOptionPane.showMessageDialog(null, "Your horoscope is " + feburary);
		} else if (born.equals("march")) {
			JOptionPane.showMessageDialog(null, "Your horoscope is " + march);
		} else if (born.equals("april")) {
			JOptionPane.showMessageDialog(null, "Your horoscope is " + april);
		} else if (born.equals("may")) {
			JOptionPane.showMessageDialog(null, "Your horoscope is " + may);
		} else if (born.equals("june")) {
			JOptionPane.showMessageDialog(null, "Your horoscope is " + june);
		} else if (born.equals("july")) {
			JOptionPane.showMessageDialog(null, "Your horoscope is " + july);
		} else if (born.equals("august")) {
			JOptionPane.showMessageDialog(null, "Your horoscope is " + august);
		} else if (born.equals("september")) {
			JOptionPane.showMessageDialog(null, "Your horoscope is " + september);
		} else if (born.equals("october")) {
			JOptionPane.showMessageDialog(null, "Your horoscope is " + october);
		} else if (born.equals("november")) {
			JOptionPane.showMessageDialog(null, "Your horoscope is " + november);
		} else if (born.equals("december")) {
			JOptionPane.showMessageDialog(null, "Your horoscope is " + december);

		}
	}
}
