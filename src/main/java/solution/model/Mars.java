package solution.model;

public class Mars {

    private static final char MOVE = 'M';
    private static final char TURN_LEFT = 'L';
    private static final char TURN_RIGHT = 'R';

    private final int X;
    private final int Y;
    private Rover rover;

    public Mars(final int X, final int Y) {
        this.X = X;
        this.Y = Y;
    }

    public void navigateRover(Rover rover, String sentence) {
        this.rover = rover;

        char[] steps = sentence.toCharArray();

        for (char step : steps) {
            if (step == MOVE) {
                moveOneStep();
            } else {
                setRoverHead(step);
            }
        }
    }

    private void moveOneStep() {
        Direction head = rover.getDirection();

        switch (head) {
            case NORTH:
                if (rover.getY() + 1 <= Y) {
                    rover.moveToNorth();
                }
                break;
            case EAST:
                if (rover.getX() + 1 <= X) {
                    rover.moveToEast();
                }
                break;
            case SOUTH:
                if (rover.getY() - 1 >= 0) {
                    rover.moveToSouth();
                }
                break;
            case WEST:
                if (rover.getX() - 1 >= 0) {
                    rover.moveToWest();
                }
                break;
        }

    }

    private void setRoverHead(char step) {
        if (TURN_LEFT == step) {
            rover.moveHeadToLeft();
        } else if (TURN_RIGHT == step) {
            rover.moveHeadToRight();
        }

    }
}
