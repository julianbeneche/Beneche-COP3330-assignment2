package opp.assignment2.ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    @Test
    void isAnagram_true() {
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("note", "note");
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_false(){
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("note", "note");
        boolean expected = false;
    }
}