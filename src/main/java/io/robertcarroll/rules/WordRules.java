package io.robertcarroll.rules;

public interface WordRules {
    boolean wordSizeCondition(int length);
    String palindromeCheckAction(String word);
}
