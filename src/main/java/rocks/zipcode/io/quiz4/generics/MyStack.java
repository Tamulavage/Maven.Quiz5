package rocks.zipcode.io.quiz4.generics;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable {
    Stack<SomeType> something; //= new Stack<>();

    public MyStack() {
        something = new Stack<>();
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Boolean isEmpty() {
        return something.empty();
    }

    public void push(SomeType i) {
        something.push(i);
    }

    public SomeType peek() {
        try {
            return something.peek();
        } catch (EmptyStackException e) {
            return null;
        }

    }

    public SomeType pop() {
        return something.pop();
    }


    @Override
    public Iterator iterator() {
        return something.iterator();

    }
}
