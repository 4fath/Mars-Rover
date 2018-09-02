package solution;

import solution.model.Direction;
import solution.model.Mars;
import solution.model.Rover;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(final String[] args) {
        System.out.println("Please type 'q' when you finished giving rovers' input(coordinate and sentence)");

        final Scanner scanner = new Scanner(System.in);

        String marsUpperRight = scanner.nextLine();
        String[] marsArr = marsUpperRight.split("\\s+");

        int X = Integer.valueOf(marsArr[0]);
        int Y = Integer.valueOf(marsArr[1]);
        final Mars mars = new Mars(X, Y);

        List<Rover> roversOnMars = new ArrayList<Rover>();
        while (true) {
            String currentLine = scanner.nextLine();
            if ("q".equalsIgnoreCase(currentLine)) {
                break;
            }

            String[] roversInfos = currentLine.split("\\s+");
            String sentenceLine = scanner.nextLine();

            int rx = Integer.valueOf(roversInfos[0]);
            int ry = Integer.valueOf(roversInfos[1]);
            char rh = roversInfos[2].charAt(0);

            Rover rover = new Rover(rx, ry, Direction.getDirection(rh));
            mars.navigateRover(rover, sentenceLine);

            roversOnMars.add(rover);
        }

        for (Rover rover : roversOnMars) {
            System.out.println(rover);
        }
    }

}
