/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Julian Beneche
 */

package opp.assignment2.ex29;

import opp.assignment2.ex24.base.AnagramDetector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvestorTest {

    @Test
    <investor>
    void investor_true() {
            investor detector = new investor();

            boolean actual = detector.investor(int value);
            boolean expected = true;

            assertEquals(expected, actual);
        }

        @Test
        <investor>
        void investor_false(){
            investor detector = new investor();

            boolean actual = detector.investor(0);
            boolean expected = false;
        }
    }
}