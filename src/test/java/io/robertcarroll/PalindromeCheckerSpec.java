package io.robertcarroll;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PalindromeCheckerSpec {
    PalindromeChecker palindromeChecker = new PalindromeChecker();
    @Before
    public void setUp(){
        palindromeChecker = new PalindromeChecker();
    }
    @Test
    public void isPalindromeTest(){
        String expected = "YES";
        String actual = palindromeChecker.isPalindromePossible("aabb");
        assertEquals(expected, actual);
    }
}
