package group_Anagrams;
import java.util.*;
import java.util.ArrayList;

public class Solution {
    public static List<List<String>> groupAnagrams(List<String> words) {
        // Write your code here.
        //step1 sort them


        return new ArrayList();
    }
    public static void main(String args[]){
        List<String> words = new ArrayList<String>();
        words.add("yo");
        words.add("act");
        words.add("flop");
        words.add("tac");
        words.add("foo");
        words.add("cat");
        words.add("oy");
        words.add("olfp");
        List<String> wordsSorted = new ArrayList<String>();
        HashSet<String> wordSet = new HashSet<>();
        for(String s: words){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String word = String.valueOf(ch);
            wordsSorted.add(word);
            wordSet.add(word);
        }
        //System.out.println("hello");
        for (String s: words) {
            System.out.print(s+" ");
        }
        System.out.println();
        for (String s: wordsSorted) {
            System.out.print(s+" ");
        }
        System.out.println("the wordset is : ");
        for (String s: wordSet) {
            System.out.print(s+" ");
        }
    }
}
