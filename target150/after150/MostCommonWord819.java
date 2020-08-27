package target150.after150;

import java.util.*;


public class MostCommonWord819 {

    public static void main(String [] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        MostCommonWord819 commonWord = new MostCommonWord819();
        String [] banned = {"hit"};
        String mosCommonWord = commonWord.mostCommonWord(paragraph,banned);
        System.out.println("Most common word --> "+mosCommonWord);
    }

    public String mostCommonWord(String paragraph, String[] banned) {

        Set<String> bannedWord = new HashSet<>();
        for(String word : banned) {
            bannedWord.add(word);
        }

        String lowerCaseParagraph = paragraph.replaceAll("[^a-zA-Z0-9 ]"," ").toLowerCase();
        String [] splitWord = lowerCaseParagraph.split(" ");

        Map<String, Integer> wordsMap = new HashMap<>();
        for(String word : splitWord) {
            if(!bannedWord.contains(word))
                wordsMap.put(word,wordsMap.getOrDefault(word,0)+1);
        }

        //
        String result = null;

        for(String word : wordsMap.keySet()) {
            if(result == null || wordsMap.get(word) > wordsMap.get(result)) {
                result = word;
            }
        }

        return result;

    }
}
