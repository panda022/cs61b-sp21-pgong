package Valid_Anagram_easy_242;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    @Test
    public void isAnagram() {
        String s = "anagram";
        String t = "nagaram";
        Solution solution = new Solution();
        assertTrue("should be true",solution.isAnagram(s,t));
    }
}