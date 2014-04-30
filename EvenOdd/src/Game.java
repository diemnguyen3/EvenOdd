
		import java.util.Random;
		import java.util.Scanner;
		import javax.swing.JOptionPane;


		public class Game {
		    int number;
		    int guess;
		    String input;
		    public boolean guessRight;
		    Random random = new Random();
		    
		    public void GetANumber()
		    {                       
		        number = random.nextInt(9)+1;
		        return;       
		    }
		    
		    public boolean guessRight()
		    {
		        if(guess == number)
		        {
		            return true;
		        }
		        return false;      
		    }

	}
