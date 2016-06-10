package io.robertcarroll.rules;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class EvenLengthRulesTest {
    private EvenLengthRules evenLengthRules;
    @Before
    public void setUp() {
        evenLengthRules = new EvenLengthRules();
    }

    @Test
    public void wordSizeCondition() {
        boolean actual = evenLengthRules.wordSizeCondition(6);
        assertTrue("The expected value is true", actual);
    }

    @Test
    public void palindromeCheckAction() {
        String expected = "YES";
        String actual = evenLengthRules.palindromeCheckAction("abab");
        assertEquals(expected, actual);
    }

    @Test
    public void checkAmountOfOddsTest(){
        HashMap<Character, Integer> countList = new HashMap<>();
        countList.put('a', 4);
        countList.put('b', 4);
        countList.put('c', 3);

        String expected = "NO";
        String actual = evenLengthRules.checkAmountOfOddCounts(countList);
        assertEquals(expected, actual);
    }
}