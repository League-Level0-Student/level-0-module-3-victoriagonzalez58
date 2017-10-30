import javax.swing.JOptionPane;
import java.util.Random;

public class checkpoint {
public static void main(String[] args) {
	String ans = JOptionPane.showInputDialog(null, "What is your favorite color?");
	JOptionPane.showInputDialog(null, ans + "is my favorite color too");
Random RandomNumberGenerator = new Random();	
int randomNumberGenerator = RandomNumberGenerator.nextInt();
JOptionPane.showMessageDialog(null, randomNumberGenerator);
}
}
