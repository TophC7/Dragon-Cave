import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

// import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dragoncave.InputControl;
import dragoncave.WrongInputException;

public class InputControlTest {

    InputControl inputControl;

    @BeforeEach
    void setUp() {
        inputControl = new InputControl();
    }

    @DisplayName("Test input left or right")
    @Test
    void testGetLR() {
        assertEquals("l", inputControl.getLR("l"), "Not l");
        assertEquals("r", inputControl.getLR("r"), "Not r");
        assertThrows(WrongInputException.class, () -> inputControl.getLR("moo"));

    }

    @DisplayName("Test input yes or no")
    @Test
    void testGetYN() {
        assertEquals("y", inputControl.getYN("y"), "Not y");
        assertEquals("n", inputControl.getYN("n"), "Not n");
        assertThrows(StackOverflowError.class, () -> inputControl.getYN("moo"));
    }

    // @AfterEach
    // void tearDown() {
    // }
}
