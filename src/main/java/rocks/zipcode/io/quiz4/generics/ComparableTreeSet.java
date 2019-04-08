package rocks.zipcode.io.quiz4.generics;

import rocks.zipcode.io.quiz4.objectorientation.StringAssembler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class    ComparableTreeSet<T> extends TreeSet<T> implements Comparable{
    //T[] fun;
    List<T> fun= new ArrayList<>();

    public ComparableTreeSet(T... arr) {
       for(T t: arr){
           fun.add(t);
       }

    }


    public ComparableTreeSet() {
    }

    public int compareTo(ComparableTreeSet<T> o) {
        return Integer.valueOf(null);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString(){

        StringAssembler sa = new StringAssembler(',');

        sa.append("[");
        for(T t: fun){
            sa.append(t.toString());
        }
        sa.append("]");

        return sa.assemble();
    }
}
