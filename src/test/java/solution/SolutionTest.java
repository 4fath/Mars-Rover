package solution;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void shouldHandleInputs() {
        System.setIn(new ByteArrayInputStream(("5 5" +
                "\n1 2 N" +
                "\nLMLMLMLMM" +
                "\nq").getBytes()));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Solution.main(new String[]{});

        assertEquals(outContent.toString(), "Please type 'q' when you finished giving rovers' input(coordinate and sentence)" +
                "\n1 3 N" +
                "\n");
    }

}
