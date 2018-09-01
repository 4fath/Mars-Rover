package solution.model;

public enum Direction {

    NORTH('N'),
    EAST('E'),
    SOUTH('S'),
    WEST('W');

    private char firstLetter;

    public char getFirstLetter() {
        return firstLetter;
    }

    Direction(char firstLetter) {
        this.firstLetter = firstLetter;
    }

    public static Direction getDirection(char firstLetter) {
        for (Direction direction : values()) {
            if (firstLetter == direction.firstLetter) {
                return direction;
            }
        }
        return NORTH;
    }

    Direction getNext(boolean reverseWay) {
        if (this.equals(NORTH)) {
            if (reverseWay) {
                return WEST;
            }
            return EAST;
        } else if (this.equals(EAST)) {
            if (reverseWay) {
                return NORTH;
            }
            return SOUTH;
        } else if (this.equals(SOUTH)) {
            if (reverseWay) {
                return EAST;
            }
            return WEST;
        } else {
            if (reverseWay) {
                return SOUTH;
            }
            return NORTH;
        }
    }
}
