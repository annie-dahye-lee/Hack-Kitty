public class HangingMan {
    
    private static int numWrongGuesses;
    private String fish;
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
    }
    
    /*
     * print cat and fish
     */
    
    public void dieSomeMore() {
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
       
    }
    
    
    public static boolean isntDead() {
        return numWrongGuesses < 9;
    }
                            
    public static void main(String[] args) {
        // System.out.print();
    }
}
