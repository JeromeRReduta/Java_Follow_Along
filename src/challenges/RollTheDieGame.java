package challenges;

import java.util.Random;

/*
Travel 20 spaces w/in 5 die rolls

If they get exactly to 20 by roll 5, end early and tell them they win
Else, tell them they lose

*/
public class RollTheDieGame {

    public static void main(String[] args) {
        /* Init values */
        int numRolls = 5;
        int currentSpace = 0;
        int end = 20;
        int spacesLeft = end;
        Random random = new Random();
        /* Roll dice until we've hit 5 rolls or win */
        for (int i = 0; i <= numRolls; i++) {
            System.out.println("Roll " + (i + 1) + " ...");
            int die = random.nextInt(6) + 1;
            currentSpace += die;
            spacesLeft = end - currentSpace;
            if (spacesLeft <= 0) {
                break;
            }
            System.out.printf(
                    "Roll #%d = %d. You are now on space %d and have %d more to go.\n",
                    i + 1,
                    die,
                    currentSpace,
                    spacesLeft);
        }
        /* Case - went over - you lose */
        if (currentSpace > end) {
            System.out.printf("Sorry, you went over by %d spaces!\n",
                    spacesLeft * -1);
        }
        /* Case - went under - you lose */
        else if (currentSpace < end) {
            System.out.printf("Sorry, you went under by %d spaces!\n",
                    spacesLeft);
        }
        /* Case - exactly 20 - you win! */
        else {
            System.out.printf("You made exactly 20! You win!\n");
        }
    }
}
