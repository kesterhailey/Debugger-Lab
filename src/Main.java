/**
 * This class is a simple driver to run one pig game.  It could 
 * be used more generally to answer more interesting questions.
 * e.g. What is the average number of turns for all cutoffs
 * between 10 and 30?
 */
public class Main
{
  public static void main(String[] args)
  {
    // Create a new game with a cutoff of 18
    PigGame g = new PigGame(25);
    
    // Run one game
    g.playGame();
    
    // output the results
    System.out.println(g.getScore());
    System.out.println(g.getNumTurns());
    System.out.println(g.getTurnAverage());
  }
}
