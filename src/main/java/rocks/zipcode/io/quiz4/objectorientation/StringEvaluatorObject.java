package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {
    String string;
    StringEvaluator evaluator = new StringEvaluator();

    public StringEvaluatorObject(String str) {
        this.string = str;
    }

    public String[] getAllSubstrings() {
        return evaluator.getAllSubstrings(string);
    }

    public String[] getCommonSubstrings(String secondInput) {
        return evaluator.getCommonSubstrings(string, secondInput);
    }

    public String getLargestCommonSubstring(String secondInput) {
        return evaluator.getLargestCommonSubstring(string, secondInput);
    }
}
