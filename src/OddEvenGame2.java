import java.util.Scanner;
import javax.swing.JOptionPane;

public class OddEvenGame2 {
	
	public static void main(String[] args)
	{
		Scanner x = new Scanner(System.in);
		int input,game,replay,win_percent, win = 0, lose = 0, odd = 0, even = 0, count = 1;
		
		String input_string = JOptionPane.showInputDialog("Enter Odd(0) or Even(1)");
		
		input = Integer.parseInt(input_string);
		
		game = Game.GetRandom();
		
		if(game%2 == 0)
			even = even +1;
		else 
			odd = odd + 1;
		
		if (game%2== 0 && input == 2)
			win = win+1;
		else 
			lose = lose+1;
		win_percent =  win/count;
		
		boolean correct = (game%2== 0 && input == 2) ? true:false;
        if (correct)
        {
        	String message = String.format("You win\n You played %d games\n You generated %d Odds and generated %d Evens\nYou won %d percent\n",count,odd,even,win_percent);
        	JOptionPane.showMessageDialog(null, message);
        }
        else
        {
        	String message = String.format("You lose!\n You played %d games\n You generated %d Odds and generated %d Evens\nYou won %d percent\n",count,odd,even,win_percent);
        	JOptionPane.showMessageDialog(null, message);
        }
        
		
	}
	
// Good job, Elias.   Please stay away from static method for now.
}
