import java.util.Stack;

/**Description
 *Given a string s which contains only lowercase letters, remove duplicate letters so that every letter appear once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.
 **/

//method1:stack
//Time:O(n)
public class removeDuplicateLetters {
    /**
     * @param s: a string
     * @return: return a string
     */
    Stack<Integer> S = new Stack();
    boolean vis[] = new boolean[26];
    int num[] = new int[26];

    public String removeDuplicateLetters(String s) {
        // write your code here
        for(int i = 0; i < s.length(); ++i) {
            num[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s.length(); ++i) {
            int id = s.charAt(i) - 'a';
            num[id]--;
            if(vis[id])continue;
            while(!S.isEmpty() && S.peek() > id && num[S.peek()] > 0) {
                vis[S.peek()] = false;
                S.pop();
            }
            S.push(id);
            vis[id] = true;
        }
        String ans = "";
        for(int x: S) {
            ans += (char)('a' + x);
        }
        return ans;
    }
}
