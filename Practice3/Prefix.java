
package Practice3;


public class Prefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {//checking for empty string
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String current = strs[i];//current string
            int j = 0;
            while (j < prefix.length() && j < current.length() && prefix.charAt(j) == current.charAt(j)) {
                j++;
            }
            prefix = prefix.substring(0, j);
            if (prefix.isEmpty()) {
                return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println( longestCommonPrefix(strs1));
    }
}


