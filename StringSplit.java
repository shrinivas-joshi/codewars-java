package org.strings;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Collections;

public class StringSplit {

    /*
    * Complete the solution so that it splits the string into pairs of two characters.
    * If the string contains an odd number of characters then it should replace
    * the missing second character of the final pair with an underscore ('_').
    *
    *  'abc' =>  ['ab', 'c_']
    * 'abcdef' => ['ab', 'cd', 'ef']
    *
    *
    * Valid answer =>
    *     s = (s.length() % 2 == 0) ? s : s+'_';
    *     return s.split("(?<\\G.{2}");
    *
    * */
    public static String[] solution(String s) {
        double length = (double)s.length()/2;
        String[] strArr = new String[(int) Math.round(length)];
        s = (s.length() % 2 != 0) ? s+'_' : s;

        String temp = "";
        int i = 0;
            for (int j = 0; j < s.length(); j += 2) {
                if (i > strArr.length) break;
                temp = String.valueOf(s.charAt(j)) + String.valueOf(s.charAt(j + 1));
                strArr[i] = temp;
                i++;
            }


        return strArr;
    }



}
