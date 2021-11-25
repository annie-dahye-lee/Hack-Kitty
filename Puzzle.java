import java.util.ArrayList;
import java.util.Random;
import java.lang.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle
{ 
    boolean isGuessRight;
    static String guessWord;
    char[] guessWordArray;
    static char[] underscores = {'_','_','_','_'};
    ArrayList<String> wordsUsed = new ArrayList<String>(10);
    public static boolean notDone;
    
    public Puzzle() {
        guessWord = "test";
        guessWordArray = guessWord.toCharArray();
        isGuessRight = false;
        notDone = true;
    }
    
    public void show() {
            System.out.print("\nGuesses: ");
            System.out.print(wordsUsed);
            System.out.print("\nPuzzle: " );
            for (int i = 0; i < guessWord.length(); i++) {
                System.out.print(Character.toUpperCase(underscores[i]));
            }
    }  
    
    public boolean makeGuess(String guessed) {
        
        char a = guessed.charAt(0);
        for (int i = 0; i < guessWordArray.length; i++) {
            if (a == guessWordArray[i]) {
                wordsUsed.add(guessed);
                underscores[i] = a;
                System.out.print(Character.toUpperCase(underscores[i]));
                if ((wordsUsed.contains("t")) && (wordsUsed.contains("e")) &&
                (wordsUsed.contains("s"))) {
                notDone = false;
            }
            }
        }
       //System.out.print(underscores.toUpperCase());
        
        
        return isGuessRight;
    }
        
    public String getWord() {
        String answer = guessWord.toString();
        return answer;
    }
    
    public static boolean isUnsolved() {
        return notDone;
    }
        
    }

