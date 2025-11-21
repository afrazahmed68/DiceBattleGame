import java.util.Random;

class Player {
    private String name;
    public Player(String name) { this.name = name; }
    public String getName() { return name; }
}

class Dice {
    Random r = new Random();
    public int roll() { return r.nextInt(6) + 1; }
}

class Game {
    Player p1, p2;
    Dice d = new Dice();

    public Game(Player p1, Player p2) {
        this.p1 = p1; 
        this.p2 = p2;
    }

    public void start() {
        int r1 = d.roll();
        int r2 = d.roll();

        System.out.println(p1.getName()+" rolled: "+r1);
        System.out.println(p2.getName()+" rolled: "+r2);

        if(r1 > r2) System.out.println(p1.getName()+" wins!");
        else if(r2 > r1) System.out.println(p2.getName()+" wins!");
        else System.out.println("It's a tie!");
    }
}

public class Dice {
    public static void main(String[] args) {
        new Game(new Player("Player 1"), new Player("Player 2")).start();
    }
}
