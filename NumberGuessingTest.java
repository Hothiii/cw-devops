import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class NumberGuessingTest {

    @Test
    public void testNonIntegerInputDoesNotCrash() {
        // Simulate input: invalid "abc" followed by valid guesses
        String simulatedInput = "abc\n20\n40\n60\n80\n100\n";
        InputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(in);

        try {
            NumberGuessing.guessingNumberGame();
        } catch (Exception e) {
            assert false : "The program crashed with non-integer input: " + e.getMessage();
        }
    }
}
