package edu.iis.mto.bsearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @BeforeEach
    void setUp() throws Exception {}

    @Test
    void test() {
        fail("Not yet implemented");
    }

    @Test
    void shouldFindElementWhenSequenceContainsOnlyThisElement() {
        // given
        int element = 100;
        int[] sequence = {element};

        // when
        SearchResult result = BinarySearch.search(element, sequence);

        // then
        assertTrue(result.isFound(), "Expected element should be found");
        assertEquals(0, result.getPosition(), "Position of found element should be 0");
    }

    @Test
    void shouldNotFindElementInSingleElementSequence() {
        // given
        int element = 100;
        int[] sequence = {200};

        // when
        SearchResult result = BinarySearch.search(element, sequence);

        // then
        assertFalse(result.isFound(), "Expected element should not be found");
        assertEquals(-1, result.getPosition(), "Position should be set to -1 for an item that's not found");
    }

    @Test
    void shouldFindElementWhenTheElementIsFirstInMultiSequence() {
        // given
        int element = 50;
        int[] sequence = {50, 100};

        // when
        SearchResult result = BinarySearch.search(element, sequence);

        // then
        assertTrue(result.isFound(), "Expected element should be found");
        assertEquals(0, result.getPosition(), "Position of found element should be 0");
    }

    @Test
    void shouldFindElementWhenTheElementIsLastInMultiSequence() {
        // given
        int element = 50;
        int[] sequence = {25, 50};

        // when
        SearchResult result = BinarySearch.search(element, sequence);

        // then
        assertTrue(result.isFound(), "Expected element should be found");
        assertEquals(1, result.getPosition(), "Position of found element should be 1");
    }

    @Test
    void shouldFindElementWhenTheElementIsInTheMiddleOfMultiSequence() {
        // given
        int element = 50;
        int[] sequence = {25, 50, 75};

        // when
        SearchResult result = BinarySearch.search(element, sequence);

        // then
        assertTrue(result.isFound(), "Expected element should be found");
        assertEquals(1, result.getPosition(), "Position of found element should be 1");
    }

}
