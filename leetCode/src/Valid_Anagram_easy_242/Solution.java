package Valid_Anagram_easy_242;

import java.util.HashMap;

public class Solution {
    public boolean isAnagram1(String s, String t) {
        if(s.length() != t.length() ){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            //System.out.print(s.charAt(i));
            char ch = s.charAt(i);
            if(i == s.length() -1 ){
                if(ch == t.charAt(0)){
                    return true;
                }
            }
            if (t.indexOf(ch) == -1){
                return false;
            } else {
                int index = t.indexOf(ch);

                t = t.substring(0,index)+t.substring(index+1,t.length());
            }
        }
        return false;

    }

    public boolean isAnagram2(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            Character ch = Character.valueOf(c);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            } else {
                map.put(ch,1);
            }

        }
        for (char c : t.toCharArray()) {
            Character ch = Character.valueOf(c);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
            } else {
                return false;
            }
        }
        for (Integer i : map.values()) {
            if(i != 0){
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        int[] counter = new int[26];
        for (char c: s.toCharArray()) {
            counter[c-'a']++;
        }
        for (char c:t.toCharArray()){
            counter[c-'a']--;
        }
        for (int i: counter) {
            if (i != 0){
                return false;
            }
        }
        return true;
    }
}
