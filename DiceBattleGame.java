import java.util.Random;

public class DiceBattleGame {
    public static void main(String[] args) {

        Random rand = new Random();

        System.out.println("🎲 Dice Battle Game 🎲");

        
        int p1 = rand.nextInt(6) + 1;  
        System.out.println("Player 1 rolled: " + p1);

        
        int p2 = rand.nextInt(6) + 1;   
        System.out.println("Player 2 rolled: " + p2);


        if (p1 > p2) {
            System.out.println("Player 1 Wins!");
        } 
        else if (p2 > p1) {
            System.out.println("Player 2 Wins!");
        } 
        else { 
            System.out.println("It's a Tie!");
        }
    }
}
