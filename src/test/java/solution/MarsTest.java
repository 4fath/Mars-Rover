package solution;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import solution.model.Direction;
import solution.model.Mars;
import solution.model.Rover;

import static org.junit.Assert.assertEquals;

public class MarsTest {

    private Mars mars;
    private Rover rover;
    private Rover rover1;

    @Before
    public void setUp() {
        rover = new Rover(1, 2, Direction.NORTH);
        rover1 = new Rover(3, 3, Direction.EAST);
        mars = new Mars(5, 5);
    }

    @After
    public void tearDown() {
        rover = null;
        rover1 = null;
        mars = null;
    }

    @Test
    public void shouldNavigateRover() {
        mars.navigateRover(rover, "LMLMLMLMM");
        assertEquals(rover.getX(), 1);
        assertEquals(rover.getY(), 3);
        assertEquals(rover.getDirection(), Direction.NORTH);

        mars.navigateRover(rover1, "MMRMMRMRRM");

        assertEquals(rover1.getX(), 5);
        assertEquals(rover1.getY(), 1);
        assertEquals(rover1.getDirection(), Direction.EAST);

        Rover r3 = new Rover(4,4, Direction.NORTH);
        mars.navigateRover(r3, "MMMMMMMML");

        assertEquals(r3.getX(), 4);
        assertEquals(r3.getY(), 5);
        assertEquals(r3.getDirection(), Direction.WEST);
    }
}
