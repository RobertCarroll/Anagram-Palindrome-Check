package io.robertcarroll.rules;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class OddLengthRulesTest {
    private OddLengthRules oddLengthRules;
    @Before
    public void setUp() throws Exception {
        oddLengthRules = new OddLengthRules();
    }

    @Test
    public void wordSizeCondition() {
        boolean actual = oddLengthRules.wordSizeCondition(5);
        assertTrue("The expected value is true", actual);
    }

    @Test
    public void palindromeCheckAction() {
        String expected = "YES";
        String actual = oddLengthRules.palindromeCheckAction("aaabbbb");
        assertEquals(expected, actual);
    }

    @Test
    public void identifyCharacterCountsTest(){
        int expected = 2;
        oddLengthRules.identifyCharacterCounts("aaabb");
        int actual = oddLengthRules.getCharacterCount('b');
        assertEquals(expected, actual);
    }

    @Test
    public void checkAmountOfOddsTest(){
        HashMap<Character, Integer> characterCountListEvenWord = new HashMap<>();
        characterCountListEvenWord.put('a', 3);
        characterCountListEvenWord.put('b', 4);
        characterCountListEvenWord.put('c', 3);

        String expected = "NO";
        String actual = oddLengthRules.checkAmountOfOddCounts(characterCountListEvenWord);
        assertEquals(expected, actual);
    }
}