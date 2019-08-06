//check if a string only contains digits
public class digitString {
    public boolean degits(String s){
        if (s == null || s.length() == 0) {
            return false;
        }
        char[] str = s.toCharArray();
        for (char ss : str) {
            if (!Character.isDigit(ss)){
                return false;
            }
        }
        return true;
    }
}
