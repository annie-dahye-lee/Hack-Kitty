public class HangingMan {
    
    private static int numWrongGuesses;
    private String fish;
    private boolean result;
    String[] HangmanImage = {"<')))><", //0
                             "<')))>" , //1
                             "<')))" , //3
                             "<'))" , //4
                             "<')" , //5
                             "<'" ,//6
                             "<" ,//7
                             "" ,//8
                            };//9
    public HangingMan() {      
        numWrongGuesses = 0;
        result = true;
    }
    
    /*
     * print cat and fish
     */
    
    public static void dieSomeMore() {
        numWrongGuesses++;
    }
    
    public void show() {
       // System.out.println('\u000c');
        // cat
        String ears = "  /\\_/\\";
        String middle = " ( o.o )";
        String bottom = "  > ^ <";
        System.out.println(ears);
        System.out.println(middle);
        System.out.println(bottom);
        System.out.println(HangmanImage[numWrongGuesses]);
        System.out.println("\nDon't let the cat go hungry."); 
        System.out.println("Total attempts remaining: " + (7 - numWrongGuesses));
    }
    
    public boolean isntDead() {
        if (numWrongGuesses >= 7) {
            return false;
        }
        return true;
    }
}
