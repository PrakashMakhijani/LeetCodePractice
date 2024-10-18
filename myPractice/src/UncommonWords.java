import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWords {

    //884. Uncommon Words from Two Sentences

    public static List<String> uncommonFromSetence(String s1, String s2){


        String concateString = s1 + " " + s2;
     List<String> result= new ArrayList<>();

        Map<String, Integer> wordCount = new HashMap<>();

        String[] words = concateString.split(" ");
        for(String word1 : words){
            wordCount.put(word1, wordCount.getOrDefault(word1,0)+1);
        }

        for(Map.Entry<String,Integer> myMap : wordCount.entrySet()){
            if(myMap.getValue() == 1){
                result.add(myMap.getKey());
            }
        }
        return result;


    }
    public static void main(String args[]){
        String string1 = "this apple is sweet";
        String string2 = "this apple is sour";

        System.out.println(UncommonWords.uncommonFromSetence(string1,string2));
    }
}
