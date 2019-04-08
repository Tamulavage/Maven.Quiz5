package rocks.zipcode.io.quiz4.generics;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_ extends Comparable> extends Group<_> {
    @Override
    public void insert(_ value) {
        if (super.something.size() > 0) {
            for (int i = 0; i < super.something.size(); i++) {
                if (value.compareTo(super.something.get(i)) < 0) {
                    super.something.add(i,value);
                    i=super.something.size();
                }
            }
        } else {
            super.something.add(value);
        }
    }

    @Override
    public void delete(_ value) {
        super.something.remove(value);
    }

    public Integer indexOf(_ value) {
        return super.something.indexOf(value);
    }

}
