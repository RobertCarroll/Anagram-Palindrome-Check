package io.robertcarroll;

import io.robertcarroll.rules.EvenLengthRules;
import io.robertcarroll.rules.OddLengthRules;
import io.robertcarroll.rules.Rules;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeChecker {
    private ArrayList<Rules> rules;

    public PalindromeChecker(){
        rules = new ArrayList<>();
        rules.addAll(Arrays.asList(new EvenLengthRules(), new OddLengthRules()));
    }

    public String isPalindromePossible(String anagram){
        String response = "";

        for(Rules rule: rules){
            if(rule.wordSizeCondition(anagram.length())){
                response = rule.palindromeCheckAction(anagram);
                break;
            }
        }

        return response;
    }
}
