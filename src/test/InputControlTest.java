import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

// import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dragoncave.GameEngine;
import dragoncave.InputControl;

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

        // user inputs wrong input moo so program should aks again for input and we
        // inject l so it should pass test
        ByteArrayInputStream in = new ByteArrayInputStream("l".getBytes());
        GameEngine.setInput(new Scanner(in));
        assertEquals("l", inputControl.getLR("moo"), "Not l");

    }

    @DisplayName("Test input yes or no")
    @Test
    void testGetYN() {
        assertEquals("y", inputControl.getYN("y"), "Not y");
        assertEquals("n", inputControl.getYN("n"), "Not n");

        // user inputs wrong input moo so program should aks again for input and we
        // inject y so it should pass test
        ByteArrayInputStream in = new ByteArrayInputStream("y".getBytes());
        GameEngine.setInput(new Scanner(in));
        assertEquals("y", inputControl.getYN("moo"), "Not y");

    }

    // @AfterEach
    // void tearDown() {
    // }
}
