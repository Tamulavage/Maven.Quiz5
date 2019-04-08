package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student implements Comparable {
    Integer id;
    Double amountOfHours = 0.0;

    public Student() {

        this(null);
    }

    public Student(Integer id) {
        this.id = id;
    }

    public void learn(Double amountOfHours) {
        this.amountOfHours += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return this.amountOfHours;
    }

    @Override
    public int compareTo(Object o) {
        if(this == o){
            return 0;
        }
        if (o instanceof Student) {
            Student temp = (Student) o;
            if (this.id < temp.id)
            {
                return -1;
            }
            if (this.id > temp.id) {
                return 1;
            }
        }

        return 0;
    }
}
