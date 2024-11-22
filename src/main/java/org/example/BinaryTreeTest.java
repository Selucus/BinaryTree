package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class BinaryTreeTest {

    @Test
    void testInsertSingleElement() {
        SearchSet searchSet = new SearchSet();
        searchSet.insert(10);
        assertTrue(searchSet.contains(10), "The set should contain the inserted element.");
        assertEquals(1, searchSet.getNumberElements(), "The set should have one element.");
    }

    @Test
    void testInsertMultipleElements() {
        SearchSet searchSet = new SearchSet();
        searchSet.insert(10);
        searchSet.insert(5);
        searchSet.insert(15);

        assertTrue(searchSet.contains(10), "The set should contain the element 10.");
        assertTrue(searchSet.contains(5), "The set should contain the element 5.");
        assertTrue(searchSet.contains(15), "The set should contain the element 15.");
        assertEquals(3, searchSet.getNumberElements(), "The set should have three elements.");
    }

    @Test
    void testInsertDuplicateElement() {
        SearchSet searchSet = new SearchSet();
        searchSet.insert(10);
        searchSet.insert(10); // Duplicate

        assertTrue(searchSet.contains(10), "The set should contain the element 10.");
        assertEquals(1, searchSet.getNumberElements(), "The set should not allow duplicate elements.");
    }

    @Test
    void testContainsNonExistentElement() {
        SearchSet searchSet = new SearchSet();
        searchSet.insert(10);
        searchSet.insert(20);

        assertFalse(searchSet.contains(15), "The set should not contain the element 15.");
    }


    @Test
    void testEmptySearchSet() {
        SearchSet searchSet = new SearchSet();
        assertEquals(0, searchSet.getNumberElements(), "The set should initially have zero elements.");
        assertFalse(searchSet.contains(10), "The set should not contain any elements.");
    }
}
