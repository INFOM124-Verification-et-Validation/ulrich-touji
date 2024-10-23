package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

/**
 * Test suite to confirm that {@link Unit}s correctly (de)occupy squares.
 *
 * @author Jeroen Roosen 
 *
 */
class OccupantTest {

    /**
     * The unit under test.
     */
    private Unit unit;

    /**
     * Resets the unit under test.
     */
    @BeforeEach
    void setUp() {
        unit = new BasicUnit();
    }

    /**
     * Asserts that a unit has no square to start with.
     */
    @Test
    void noStartSquare() {
        assertTrue(this.unit.hasSquare() == false);
    }

    /**
     * Tests that the unit indeed has the target square as its base after
     * occupation.
     */
    @Test
    void testOccupy() {
        Square square = new BasicSquare();
        this.unit.occupy(square);
        assertEquals(this.unit.getSquare(),square);
    }

    /**
     * Test that the unit indeed has the target square as its base after
     * double occupation.
     */
    @Test
    void testReoccupy() {
        Square square = new BasicSquare();
        this.unit.occupy(square);
        this.unit.leaveSquare();
        this.unit.occupy(square);
        assertEquals(this.unit.getSquare(),square);
    }
}
