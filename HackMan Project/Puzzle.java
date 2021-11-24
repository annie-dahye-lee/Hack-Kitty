import java.util.ArrayList;
import java.util.Random;
import java.lang.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle
{ 
    int attemptsLeft;
    boolean isGuessRight;
    String guessWord;
    char[] guessWordArray;
    char[] underscores = {'_','_','_','_'};;
    ArrayList<String> wordsUsed = new ArrayList<String>(10);
    public static boolean win;
    
    public Puzzle() {
        guessWord = "test";
        guessWordArray = guessWord.toCharArray();
        attemptsLeft = 10;
        isGuessRight = false;
        win = true;
    }
    
    public void show() {
        System.out.print("\nGuesses: ");
        System.out.print(wordsUsed);
        System.out.print("\nPuzzle: " );
        for (int i = 0; i < guessWord.length(); i++) {
            System.out.print(underscores[i]);
        }
        for (int i = 0; i < wordsUsed.size(); i++) {
            if ((wordsUsed.contains("T")) &&  (wordsUsed.contains("E")) &&
            (wordsUsed.contains("S"))){
                win = true;
            }
        }
    }  
    
    public boolean makeGuess(String guessed) {
        wordsUsed.add(guessed);
        char a = guessed.charAt(0);
        for (int i = 0; i < guessWordArray.length; i++) {
            if (a == guessWordArray[i]) {
                isGuessRight = true;
                underscores[i] = a;
                if (underscores.toString().equals(guessWord)) {
                    win = true;
                }
                System.out.print(underscores);
            }
        }  
        return isGuessRight;
    }
    
    public boolean isUnsolved() {
        String yourAnswer = underscores.toString();
        String answer = guessWord.toString();
        if (!yourAnswer.equals("test")) {
            return true;
        }
        return false;
    }
        
    public String getWord() {
        String answer = guessWord.toString();
        return answer;
    }
        
    }

