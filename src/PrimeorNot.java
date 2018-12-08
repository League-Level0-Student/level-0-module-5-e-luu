import javax.swing.JOptionPane;

public class PrimeorNot {
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("This program will check if a number is prime. Which number do you want to check?");
		int count = 0;
		int num = Integer.parseInt(number);
		for (int i = 2; i < num; i++) {
			if (num%i==0) {
				count++;
				break;
			}
		}
		if (count>0) {
			JOptionPane.showMessageDialog(null, "the number is prime");
		}else {
			JOptionPane.showMessageDialog(null, "the number is not prime");
		}
	}

}
