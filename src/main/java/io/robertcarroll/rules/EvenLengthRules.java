package io.robertcarroll.rules;

import java.util.HashMap;

public class EvenLengthRules extends Rules{
    @Override
    public boolean wordSizeCondition(int length) {
        return length % 2 == 0;
    }

    @Override
    public String palindromeCheckAction(String word) {
        identifyCharacterCounts(word);

        return checkAmountOfOddCounts(characterListCount);
    }

    @Override
    public String checkAmountOfOddCounts(HashMap<Character, Integer> hashMap) {
        int amountOfOddPairs = 0;

        for(Integer count : hashMap.values()){
            if(count % 2 != 0){
                amountOfOddPairs++;
            }
        }

        if(amountOfOddPairs > 0){
            return "NO";
        }

        return "YES";
    }
}
