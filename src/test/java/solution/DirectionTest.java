package solution;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import solution.model.Direction;

import static org.junit.Assert.assertEquals;

public class DirectionTest {

    private Direction direction;

    @Before
    public void setUp() {
        direction = Direction.NORTH;
    }

    @After
    public void tearDown() {
        direction = null;
    }

    @Test
    public void shouldGetNextDirection() {
        Direction next = direction.getNext(false);
        assertEquals(next, Direction.EAST);

        Direction reverseNext = direction.getNext(true);
        assertEquals(reverseNext, Direction.WEST);
    }

    @Test
    public void shouldGetDirectionWithFirstLetter() {
        Direction south = Direction.getDirection('S');
        assertEquals(south, Direction.SOUTH);

        Direction east = Direction.getDirection('E');
        assertEquals(east, Direction.EAST);
    }

    @Test
    public void shouldGetFirstLetter() {
        assertEquals('N', direction.getFirstLetter());
        assertEquals('W', Direction.WEST.getFirstLetter());
    }
}
