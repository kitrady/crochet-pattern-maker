package com.kitrady;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;

public class InputHandlerTest {
    @Test
    public void testHardcodeRadius() {
        InputHandler classUnderTest = new InputHandler(2.4, 4.3, 3.4);
        assertEquals(1.2, classUnderTest.getRadius());
    }

    @Test
    public void testHardcodeGauge() {
        InputHandler classUnderTest = new InputHandler(2.4, 4.3, 3.4);
        assertEquals(4.3, classUnderTest.getStitchGauge());
    }

    @Test
    public void testHardcodeVertGauge() {
        InputHandler classUnderTest = new InputHandler(2.4, 4.3, 3.4);
        assertEquals(3.4, classUnderTest.getRoundGauge());
    }

    @Test
    public void testHardcodeNegInput() {
        InputHandler classUnderTest = new InputHandler(-4, -3, -3);
        assertEquals(2, classUnderTest.getRadius());
        assertEquals(3, classUnderTest.getStitchGauge());
        assertEquals(3, classUnderTest.getRoundGauge());
    }

    @Test
    public void testInputRadius() {
        String data = "2\n3\n4\n";
        Scanner input = new Scanner(data);
        InputHandler classUnderTest = new InputHandler(input);
        assertEquals(1, classUnderTest.getRadius());
    }

    @Test
    public void testInputGauge() {
        String data = "2\n3\n4\n";
        Scanner input = new Scanner(data);
        InputHandler classUnderTest = new InputHandler(input);
        assertEquals(3, classUnderTest.getStitchGauge());
    }

    @Test
    public void testInputVertGauge() {
        String data = "4\n3\n4\n";
        Scanner input = new Scanner(data);
        InputHandler classUnderTest = new InputHandler(input);
        assertEquals(4, classUnderTest.getRoundGauge());
    }

    @Test
    public void testInputNegInput() {
        String data = "-3.8\n-4.1\n-3.7\n";
        Scanner input = new Scanner(data);
        InputHandler classUnderTest = new InputHandler(input);
        assertEquals(1.9, classUnderTest.getRadius());
        assertEquals(4.1, classUnderTest.getStitchGauge());
        assertEquals(3.7, classUnderTest.getRoundGauge());
    }

    @Test
    public void testStRadius() {
        InputHandler classUnderTest = new InputHandler(2, 4, 3);
        assertEquals(4, classUnderTest.getRadiusInStitches());
    }

    @Test
    public void testRdCircumference() {
        InputHandler classUnderTest = new InputHandler(2.2, 4.7, 3.9);
        assertEquals((6.2831 * 1.1 * 3.9), classUnderTest.getCircumferenceInRounds());
    }
}
