import java.util.Scanner;

public class Rockpaperscissors {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        String playerA;
        String playerB;

        do {
            System.out.print("Player A - Enter R, P, or S: ");
            playerA = in.nextLine();

            if (!playerA.equalsIgnoreCase("R") &&
                    !playerA.equalsIgnoreCase("P") &&
                    !playerA.equalsIgnoreCase("S")) {
                System.out.println("Invalid move. Please try again.");
            }

        } while (!playerA.equalsIgnoreCase("R") &&
                !playerA.equalsIgnoreCase("P") &&
                !playerA.equalsIgnoreCase("S"));

        do {
            System.out.print("Player B - Enter R, P, or S: ");
            playerB = in.nextLine();

            if (!playerB.equalsIgnoreCase("R") &&
                    !playerB.equalsIgnoreCase("P") &&
                    !playerB.equalsIgnoreCase("S")) {
                System.out.println("Invalid move. Please try again.");
            }

        } while (!playerB.equalsIgnoreCase("R") &&
                !playerB.equalsIgnoreCase("P") &&
                !playerB.equalsIgnoreCase("S"));

        if (playerA.equalsIgnoreCase(playerB)) {
            System.out.println("It's a Tie!");
        } else if (playerA.equalsIgnoreCase("R")) {
            if (playerB.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors - Player A wins!");
            } else if (playerB.equalsIgnoreCase("P")) {
                System.out.println("Paper covers Rock - Player B wins!");
            }
        } else if (playerA.equalsIgnoreCase("P")) {
            if (playerB.equalsIgnoreCase("R")) {
                System.out.println("Paper covers Rock - Player A wins!");
            } else if (playerB.equalsIgnoreCase("S")) {
                System.out.println("Scissors cuts Paper - Player B wins!");

            }
        } else if (playerA.equalsIgnoreCase("S")) {
            if (playerB.equalsIgnoreCase("P")) {
                System.out.println("Scissors cuts Paper - Player A wins!");

            } else if (playerB.equalsIgnoreCase("R")) {
                System.out.println("Rock breaks Scissors - Player B wins!");
            }
        }

        in.close();

    } // Closes the main method
}     // Closes the Main class

