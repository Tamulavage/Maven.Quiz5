package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Collections;

import static rocks.zipcode.io.quiz4.fundamentals.StringEvaluator.removeDupStrings;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        ArrayList<String> listOfPlindromes = new ArrayList<>();
        int len = string.length();
        for(int i=0; i<len; i++){
            String tempSubString= "";
            for(int j=i; j<len; j++){
                tempSubString=tempSubString+string.charAt(j);
                if(isPalindrome(tempSubString)){
                    listOfPlindromes.add(tempSubString);
                }
            }
        }

        Collections.sort(listOfPlindromes);

        listOfPlindromes = removeDupStrings(listOfPlindromes);

        String[] retVal = listOfPlindromes.toArray(new String[listOfPlindromes.size()]);
        return retVal;
    }



    public static Boolean isPalindrome(String string) {
        for(int i = 0; i< string.length(); i++){
            if(string.charAt(i) != string.charAt(string.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.reverse();

        return sb.toString();
    }
}
