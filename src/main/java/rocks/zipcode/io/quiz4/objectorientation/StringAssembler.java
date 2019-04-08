package rocks.zipcode.io.quiz4.objectorientation;

import java.util.ArrayList;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    Character delimeter;
    ArrayList<String> string;


    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
        string = new ArrayList<>();
    }

    public StringAssembler append(String str) {

        string.add(str);

        return this;
    }

    public String assemble() {
        String retVal = "";
        for (int i = 0; i < string.size(); i++) {
            if (i > 0) {
                retVal += delimeter;
            }
            retVal += string.get(i);
        }

        return retVal;
}
}
