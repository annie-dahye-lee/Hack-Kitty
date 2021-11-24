import java.util.*;

public class HangmanGame {
    
    public static void main (String[] args) {
        System.out.println('\u000c');
        Scanner scanner = new Scanner(System.in); // create scanner obj that takes in user obj
        HangingMan hangingMan = new HangingMan(); // hangman obj
        Puzzle puzzle = new Puzzle(); // puzzle obj
        
        while (puzzle.isUnsolved() && hangingMan.isntDead()) {
            hangingMan.show(); // print cat
            puzzle.show(); // underscores, guesses
            System.out.print("\nMake a guess: "); 
            String guessChar = scanner.nextLine(); // scanner takes in user input on next line
            if (!puzzle.makeGuess(guessChar)) {
                hangingMan.dieSomeMore(); // delete one char of fish every wrong guess
            }
            System.out.println('\u000c');
        }
        
        if (hangingMan.isntDead()) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose! The word was " + puzzle.getWord()); 
        }
    }
    
    public static void clearScreen() {
        //System.out.println("\f");
        System.out.println('\u000c');
    }
}

