package solution.model;

public class Rover {

    private int x;
    private int y;
    private Direction direction;

    public Rover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    // keep it simple stupid
    public void moveToNorth() {
        y++;
    }

    public void moveToEast() {
        x++;
    }

    public void moveToSouth() {
        y--;
    }

    public void moveToWest() {
        x--;
    }


    public void moveHeadToLeft() {
        this.direction = direction.getNext(true);
    }

    public void moveHeadToRight() {
        this.direction = direction.getNext(false);
    }

    @Override
    public String toString() {
        return x + " " + y + " " + direction.getFirstLetter();
    }
}
