package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable<String> {
    List<String> simpleStrings;// = new ArrayList<>();

    public SimpleStringGroup() {
        this.simpleStrings = new ArrayList<>();
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Integer count() {
        return simpleStrings.size();
    }

    public void insert(String string) {
        simpleStrings.add(string);
    }

    public Boolean has(String string) {
        return simpleStrings.contains(string);
    }

    public String fetch(int indexOfValue) {
        return simpleStrings.get(indexOfValue);
    }

    public void delete(String string) {
        simpleStrings.remove(string);
    }

    public void clear() {
        simpleStrings.removeAll(simpleStrings);
    }

    @Override
    public Iterator<String> iterator() {
        return simpleStrings.iterator();
    }



}
