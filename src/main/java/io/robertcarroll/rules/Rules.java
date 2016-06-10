package io.robertcarroll.rules;

import java.util.HashMap;

public abstract class Rules implements WordRules{
    protected HashMap<Character, Integer> characterListCount = new HashMap<>();

    public void identifyCharacterCounts(String word){
        for(int i = 0; i < word.length(); i++){
            char characterFound = word.charAt(i);
            if(characterListCount.containsKey(characterFound)){
                characterListCount.put(characterFound, characterListCount.get(characterFound)+ 1);
            }else{
                characterListCount.put(characterFound, 1);
            }
        }
    }

    public abstract String checkAmountOfOddCounts(HashMap<Character, Integer> hashMap);
}
