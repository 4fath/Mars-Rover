package solution;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import solution.model.Direction;
import solution.model.Rover;

import static org.junit.Assert.assertEquals;

public class RoverTest {

    private Rover rover;

    @Before
    public void setUp() {
        rover = new Rover(3, 3, Direction.EAST);
    }

    @After
    public void tearDown() {
        rover = null;
    }

    @Test
    public void shouldHeadMove() {
        rover.moveHeadToLeft();
        assertEquals(rover.getDirection(), Direction.NORTH);

        rover.moveHeadToLeft();
        assertEquals(rover.getDirection(), Direction.WEST);

        rover.moveHeadToRight();
        assertEquals(rover.getDirection(), Direction.NORTH);

        rover.moveHeadToRight();
        assertEquals(rover.getDirection(), Direction.EAST);

        rover.moveHeadToRight();
        rover.moveHeadToRight();
        rover.moveHeadToRight();
        rover.moveHeadToRight();
        assertEquals(rover.getDirection(), Direction.EAST);
    }

    @Test
    public void shouldMoveOnWays() {
        rover.moveToSouth();
        assertEquals(rover.getY(), 2);

        rover.moveToEast();
        assertEquals(rover.getX(), 4);
    }

    @Test
    public void shouldPrint() {
        assertEquals(rover.toString(), "3 3 E");
    }
}
