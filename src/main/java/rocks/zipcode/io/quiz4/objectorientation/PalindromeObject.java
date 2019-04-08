package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {
    String string ;
    PalindromeEvaluator evaluator = new PalindromeEvaluator();

    public PalindromeObject(String input) {
        string=input;
    }

    public String[] getAllPalindromes(){

        return evaluator.getAllPalindromes(string);
    }

    public Boolean isPalindrome(){
        return evaluator.isPalindrome(string);
    }

    public String reverseString(){

        return evaluator.reverseString(string);
    }
}
