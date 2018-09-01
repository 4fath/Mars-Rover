package solution;

import solution.model.Direction;
import solution.model.Mars;
import solution.model.Rover;

public class Solution {

    public static void main(final String[] args) {

        // for now, lets start with dummy data
        // TODO : read values from console
        int X = 5;
        int Y = 5;

        int r1x = 1;
        int r1y = 2;
        char r1h = 'N';
        String r1sentence = "LMLMLMLMM";

        final Mars mars = new Mars(X , Y);

        Rover r1 = new Rover(r1x, r1y, Direction.getDirection(r1h));
        mars.addRover(r1);
        mars.navigateRover(r1sentence);

        System.out.println(mars.getRover());

        int r2x = 3;
        int r2y = 3;
        char r2h = 'E';
        String r2sentence = "MMRMMRMRRM";

        Rover r2 = new Rover(r2x, r2y, Direction.getDirection(r2h));
        mars.addRover(r2);
        mars.navigateRover(r2sentence);

        System.out.println(mars.getRover());

    }

}
