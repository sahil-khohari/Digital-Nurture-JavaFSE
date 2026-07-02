package com.cognizant.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertionsTest {

    @Test
    public void testAssertions() {

        // assertEquals
        assertEquals(10, 5 + 5);

        // assertTrue
        assertTrue(10 > 5);

        // assertFalse
        assertFalse(5 > 10);

        // assertNull
        String str = null;
        assertNull(str);

        // assertNotNull
        String name = "Cognizant";
        assertNotNull(name);
    }
}