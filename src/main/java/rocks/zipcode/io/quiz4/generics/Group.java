package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<T> implements Iterable<T> , GroupInterface<T>{
    List<T> something;

    public Group() {
        something = new ArrayList<>();
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Integer count() {
        return something.size();
    }

    public void insert(T value) {
        something.add(value);
    }

    public Boolean has(T value) {
        return something.contains(value);
    }

    public T fetch(int indexOfValue) {
        return something.get(indexOfValue);
    }

    public void delete(T value) {
        something.remove(value);
    }

    public void clear() {
        something.removeAll(something);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for(int i = 0; i<something.size(); i++){
            if(i> 0 ) {
                sb.append(", ");
            }
            sb.append(something.get(i).toString());
        }
        sb.append(']');
        return sb.toString();
    }

    public Iterator<T> iterator() {
        return something.iterator();
    }
}
