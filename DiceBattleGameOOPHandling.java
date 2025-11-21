import java.util.*;

class InvalidRollException extends Exception {
    public InvalidRollException(String msg) { super(msg); }
}

class Player {
    private String name;
    public Player(String name) { this.name = name; }
    public String getName() { return name; }
}

class Dice {
    Random r = new Random();
    public int roll() throws InvalidRollException {
        int x = r.nextInt(6) + 1;
        if (x < 1 || x > 6) throw new InvalidRollException("Invalid dice value!");
        return x;
    }
}

class Game {
    Player p1, p2;
    Dice d = new Dice();
    Scanner sc = new Scanner(System.in);

    public Game(Player p1, Player p2) {
        this.p1 = p1; 
        this.p2 = p2;
    }

    public void start() {
        try {
            System.out.println("Press Enter to roll dice...");
            sc.nextLine(); // can throw input issues

            int r1 = d.roll();
            int r2 = d.roll();

            System.out.println(p1.getName()+" rolled: "+r1);
            System.out.println(p2.getName()+" rolled: "+r2);

            if(r1 > r2) System.out.println(p1.getName()+" wins!");
            else if(r2 > r1) System.out.println(p2.getName()+" wins!");
            else System.out.println("It's a tie!");

        } catch (InvalidRollException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please press Enter only.");
        } catch (Exception e) {
            System.out.println("Unexpected error occurred!");
        }
    }
}

public class DiceBattleGame {
    public static void main(String[] args) {
        new Game(new Player("Player 1"), new Player("Player 2")).start();
    }
}
