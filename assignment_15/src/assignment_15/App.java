package assignment_15;

import ignore.TestingUtils;

public class App {


    /**
     * Given a string, return the length of the longest streak of the same chars in the string.
     *
     * <br>
     * <br>
     *
     * <b>EXPECTATIONS:</b><br>
     * longestStreak("hayyeu") <b>---></b> 2<br>
     * longestStreak("XPNzzzddOOOxx")  <b>---></b> 3 <br>
     * longestStreak("")  <b>---></b> 0 <br>
     */

    public static int longestStreak(String str) {

        if (str.isEmpty())
            return 0;
        int count = 1;
        int maxcount = 1;
        for (int i = 0; i < str.length(); i++) {  //xyzz
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                if (count > maxcount) {
                    maxcount = count;
                }
                count = 1;
            }


        }

        return maxcount;
    }


    //----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
    public static void main(String args[]) {
        TestingUtils.runTests();

    }
}

