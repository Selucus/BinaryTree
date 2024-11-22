package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionalArrayTest {
    @Test
    public void constructor_createsFunctionalArrayOfCorrectSize() {
        // ARRANGE
        int size = 7;

        // ACT
        FunctionalArray array = new FunctionalArray(size);

        // ASSERT
        for (int i = 0; i < size; i++) {
            assertEquals("Initial value should be 0", 0, array.get(i));
        }
    }


    @Test(expected = IndexOutOfBoundsException.class)
    public void get_withIndexOutOfBounds_throwsException() {
        // ARRANGE
        FunctionalArray array = new FunctionalArray(5);

        // ACT & ASSERT
        array.get(5); // Out of bounds
    }

    @Test
    public void set_updatesValueAtIndex() {
        // ARRANGE
        FunctionalArray array = new FunctionalArray(10);

        // ACT
        array.set(3, 42); // Set index 3 to 42

        // ASSERT
        assertEquals("Value at index 3 should be updated to 42", 42, array.get(3));
    }

    @Test
    public void set_multipleValues_updatesCorrectly() {
        // ARRANGE
        FunctionalArray array = new FunctionalArray(10);

        // ACT
        array.set(2, 10);
        array.set(5, 20);

        // ASSERT
        assertEquals("Value at index 2 should be 10", 10, array.get(2));
        assertEquals("Value at index 5 should be 20", 20, array.get(5));
        assertEquals("Value at index 0 should remain 0", 0, array.get(0)); // Unchanged value
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void set_withIndexOutOfBounds_throwsException() {
        // ARRANGE
        FunctionalArray array = new FunctionalArray(5);

        // ACT & ASSERT
        array.set(5, 100); // Out of bounds
    }

    @Test
    public void get_returnsCorrectValue() {
        // ARRANGE
        FunctionalArray array = new FunctionalArray(10);
        array.set(4, 99);

        // ACT
        int value = array.get(4);

        // ASSERT
        assertEquals("Value at index 4 should be 99", 99, value);
    }

    @Test
    public void constructor_createsBinaryTreeStructure() {
        // ARRANGE
        FunctionalArray array = new FunctionalArray(7);

        // ACT
        array.set(0, 10); // Set root
        array.set(1, 20); // Set left child
        array.set(2, 30); // Set right child

        // ASSERT
        assertEquals("Root value should be 10", 10, array.get(0));
        assertEquals("Left child value should be 20", 20, array.get(1));
        assertEquals("Right child value should be 30", 30, array.get(2));
    }
}
