package assignment_12;

import ignore.TestingUtils;

import java.util.HashSet;
import java.util.Set;

public class App {


    /**
     * Return a version of the given string, where for every star (*)
     * in the string the star and the chars immediately to its left and right are gone.
     * So "ab*cd" yields "ad" and "ab**cd" also yields "ad". 	<br>
     * <br>
     *
     * <b>EXPECTATIONS:</b><br>
     * starKill("cd*zq")  <b>---></b>"cq"<br>
     * starKill("ab**cd")    <b>---></b> "ad" <br>
     * starKill("wacy*xko") <b>---></b> "wacko" <br>
     */

    public static String starKill(String str) {
        StringBuilder str1 = new StringBuilder();

        String[] splitStr = str.split("");

        for (int i = 0; i < splitStr.length; i++) {
            if ((splitStr[i].equals("*")) || (i + 1 < splitStr.length && splitStr[i + 1].equals("*")) || (i > 0 && splitStr[i - 1].equals("*"))) {
                continue;
            }
            str1.append(splitStr[i]);

        }

        return str1.toString();
    }


    //----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
    public static void main(String args[]) {
        TestingUtils.runTests();

    }
}
