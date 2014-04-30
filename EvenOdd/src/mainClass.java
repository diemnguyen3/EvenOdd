
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class mainClass {
    public static void main(String[] args) {
        Random random = new Random();
        String input;
        String message;    
        int guessesLeft=3;
        Game game = new Game();
        Scanner tKeyboard = new Scanner(System.in);
        game.guessRight=false;
        do
        {
            input = JOptionPane.showInputDialog("Please enter your guess between 1 and 10");
            game.guess =Integer.parseInt(input);
            game.GetANumber();
            {
                if (game.guessRight == true)
                {
                    System.out.println ("You guess is correct");
               break;
                }
             
                
                if(game.guess>game.number && guessesLeft>0)
                {
                	System.out.println ("You guess is too high");
                    
                }
                else if(game.guess<game.number && guessesLeft>0)
                {
                	System.out.println ("You guess is too low");
                }
                else
                {
                	System.out.println ("Your out of guesses");
                    
                }
            }
            
            
        }while(game.guessRight=false||guessesLeft>0);
        
    }
}

