import java.util.Arrays;

//Write a method anagram(s,t) to decide if two strings are reverse or not.
//o(1) o(n)
public class reverseString {
    /**
     * @param s: The first string
     * @param t: The second string
     * @return: true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
        if (s == null ||t ==null || s.length() != t.length()) {
            return false;
        }
        char[] st = s.toCharArray();
        char[] tem = new char[s.length()];
        int start = 0;
        while (start < s.length()){
            tem[s.length() - 1 - start] = st[start];
            start ++;
        }
        String res = Arrays.toString(tem);
        if(res.equals(t) || s.equals(t)) {
            return true;
        }
        return false;
    }
}
