import java.util.Scanner;

public class play {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hur många rundor vi spela huh?!: ");
        int numRounds = scanner.nextInt();

        int player1Wins = 0;
        int player2Wins = 0;

        for (int i = 1; i <= numRounds; i++) {
            System.out.println("Round " + i);

            card player1 = new card();
            player1.setMana();
            player1.setHp();
            player1.setDmg();
            player1.setElement();

            card player2 = new card();
            player2.setMana();
            player2.setHp();
            player2.setDmg();
            player2.setElement();

            int player1Buff = 0;
            int player2Buff = 0;

            //Player 1 elemental buffs
            if (player1.getElement().equals("Water") && player2.getElement().equals("Fire")) {
                player1Buff = 2;
            } else if (player1.getElement().equals("Fire") && player2.getElement().equals("Air")) {
                player1Buff = 2;
            } else if (player1.getElement().equals("Air") && player2.getElement().equals("Earth")) {
                player1Buff = 2;
            } else if (player1.getElement().equals("Earth") && player2.getElement().equals("Water")) {
                player1Buff = 2;
            } else if (player1.getElement().equals("Star")) {
                player1Buff = 1000;

            } else if (player2.getElement().equals("Water") && player1.getElement().equals("Fire")) {
                player2Buff = 2;
            } else if (player2.getElement().equals("Fire") && player1.getElement().equals("Air")) {
                player2Buff = 2;
            } else if (player2.getElement().equals("Air") && player1.getElement().equals("Earth")) {
                player2Buff = 2;
            } else if (player2.getElement().equals("Earth") && player1.getElement().equals("Water")) {
                player2Buff = 2;
            } else if (player2.getElement().equals("Star")) {
                player2Buff = 1000;
            }

            player1.setDmg(player1.getDmg() + player1Buff);
            player2.setDmg(player2.getDmg() + player2Buff);

            System.out.println("Player 1: " + player1.getElement() + " card with " + player1.getHp() + " HP and " + player1.getDmg() + " damage");
            System.out.println("Player 2: " + player2.getElement() + " card with " + player2.getHp() + " HP and " + player2.getDmg() + " damage");

            if (player1.getDmg() > player2.getDmg()) {
                System.out.println("Player 1 wins this round!");
                player1Wins++;
            } else if (player2.getDmg() > player1.getDmg()) {
                System.out.println("Player 2 wins this round!");
                player2Wins++;
            } else {
                System.out.println("It's a tie!");
            }
        }
        System.out.println("Player 1 wins: " + player1Wins);
        System.out.println("Player 2 wins: " + player2Wins);
    }
}