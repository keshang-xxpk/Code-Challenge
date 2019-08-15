//Given two words (start and end), and a dictionary, find the shortest transformation sequence from start to end, output the length of the sequence.
//Transformation rule such that:
//Input：start = "a"，end = "c"，dict =["a","b","c"]
//Output：2
//Explanation：
//"a"->"c"
public class Solution {
    /*
     * @param start: a string
     * @param end: a string
     * @param dict: a set of string
     * @return: An integer
     */
    public int ladderLength(String start, String end, Set<String> dict) {
        // write your code here
        if (dict == null) {//check edge cases
            return 0;
        }
        if (start.equals(end)) {
            return 1;
        }
        dict.add(start);
        dict.add(end);
        
        HashSet<String> hash = new HashSet<String>();
        Queue<String> queue = new LinkedList<String>();//queue poll()
        queue.offer(start);
        hash.add(start);
        
        int length = 1;
        while (!queue.isEmpty()) {  //开始bfs
            length ++;
            int size = queue.size();//当前步数的队列大小
            for (int i = 0; i < size; i++) {
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                for (String nextWord : getNextWords(word,dict)) {
                    if (hash.contains(nextWord)) {
                        continue;
                    }
                    if (nextWord.equals(end)) {
                        return length;
                    }
                    hash.add(nextWord);
                    queue.offer(nextWord);
                }
            }
        }
           return 0; 
    }
    // replace character of a string at given index to a given character
    // return a new string
    public String replace(String s,int index,char c) {
        char[] chars = s.toCharArray();
        chars[index] = c;
        return new String(chars);
    }
    
    // get connections with given word.
    // for example, given word = 'hot', dict = {'hot', 'hit', 'hog'}
    // it will return ['hit', 'hog']
    public ArrayList<String> getNextWords(String word,Set<String> dict) {
        ArrayList<String> nextWords = new ArrayList<String>();
        
        for (char c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i <word.length(); i++) {
                if (word.charAt(i) == c) {
                    continue;
                }
                String nextWord = replace(word,i,c);
                if (dict.contains(nextWord)) {
                    nextWords.add(nextWord);
                }
            }
        }
        return nextWords;
    }
}
