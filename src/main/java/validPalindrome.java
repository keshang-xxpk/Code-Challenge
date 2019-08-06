//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//Two pointers
public class validPalindrome {
/**
 * @param s: A string
 * @return: Whether the string is a valid palindrome
 */
public boolean isPalindrome(String s) {
    // write your code here
    //edge case
    if(s == null || s.length() == 0) {
        return true;
    }
    int start = 0;
    int end = s.length() - 1;
    while(start<end){
        while(start<s.length() && !isVaild(s.charAt(start))) {
            start ++;
        }
        while(end >= 0 && !isVaild(s.charAt(end))) {
            end --;
        }
        if(end<0){
            return true;
        }
        //if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end)))
        if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))){
            break;
        }else {
            start ++;
            end --;
        }
    }
    return start >= end;
}
    public boolean isVaild(char s){
        return Character.isLetter(s) || Character.isDigit(s);
    }
}
