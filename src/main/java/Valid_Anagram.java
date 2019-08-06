//Write a method anagram(s,t) to decide if two strings are anagrams or not.
//Challenge
//O(n) time, O(1) extra space

import java.util.HashMap;
import java.util.Map;

//O(n) time, O(1) extra space hashmap
public class Valid_Anagram {
    /**
     * @param s: The first string
     * @param t: The second string
     * @return: true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> hash = new HashMap<Character, Integer>();
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        for (char i : ss) {
            if (hash.containsKey(i)) {
                hash.put(i, hash.get(i) + 1);
            }
            if (!hash.containsKey(i)) {
                hash.put(i, 1);
            }
        }
        for (char i : tt) {
            if (hash.containsKey(i)) {
                hash.put(i, hash.get(i) - 1);
            }
            if (!hash.containsKey(i)) {
                return false;
            }
        }
        return true;
    }
}
