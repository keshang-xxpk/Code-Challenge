//Given an input string, reverse the string word by word.
public class reverseWordByWord {
    /*
     * @param s: A string
     * @return: A string
     */
    public String reverseWords(String s) {
        // write your code here
        if (s == null || s.length() == 0) {
            return " ";
        }
        String[] arr = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = arr.length - 1;i >= 0; i --) {
            if (!arr[i].equals("")) {
                if (res.length() > 0){
                    res.append(" ");
                }
                res.append(arr[i]);
            }
        }
        return res.toString();
    }
}
