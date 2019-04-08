package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {

        ArrayList<String> listOfSubstrings = new ArrayList<>();
        Integer len = string.length();

        for(int i = 0; i< len; i++){
            for(int j = (i+1); j <= len; j++){
                listOfSubstrings.add(string.substring(i,j));
            }
        }

        Collections.sort(listOfSubstrings);

        listOfSubstrings = removeDupStrings(listOfSubstrings);

        String[] retVal = listOfSubstrings.toArray(new String[listOfSubstrings.size()]);

        return retVal;

    }


    static ArrayList<String> removeDupStrings(ArrayList<String> listOfSubstrings) {
        ArrayList<String> retVal = new ArrayList<>();
        for(int i = 0; i< listOfSubstrings.size()-1;i++){
            if(!listOfSubstrings.get(i).equals(listOfSubstrings.get(i+1))){
                retVal.add(listOfSubstrings.get(i));
            }
        }
        retVal.add(listOfSubstrings.get(listOfSubstrings.size()-1));
        return retVal;
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        String[] initialSubString1 = getAllSubstrings(string1);
        String[] initialSubString2 = getAllSubstrings(string2);
        ArrayList<String> commonStrings = new ArrayList<>();
        for(String ele: initialSubString1){
            if(contains(ele, initialSubString2)){
                commonStrings.add(ele);
            }
        }
        String[] retVal = commonStrings.toArray(new String[commonStrings.size()]);
        return retVal;
    }

    private static Boolean contains(String string, String[] stringArray) {
        for(String ele: stringArray){
            if(ele.equals(string)){
                return true;
            }
        }
        return false;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] commonString = getCommonSubstrings(string1, string2);
        String retVal = "";
        for(String string:commonString){
            if(string.length() > retVal.length()){
                retVal = string;
            }
        }
        return retVal;
    }
}
