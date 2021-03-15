package edu.iis.mto.bsearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @BeforeEach void setUp() throws Exception {
    }

    @Test void test() {
        fail("Not yet implemented");
    }

    @Test void shouldFindElementWhenSequenceContainsOnlyThisElement() {
        // given
        int element = 100;
        int[] sequence = {element};

        // when
        SearchResult result = BinarySearch.search(element, sequence);

        // then
        assertTrue(result.isFound(), "Expected element should be found");
        assertEquals(0, result.getPosition(), "Position of found element should be 0");
    }

}
