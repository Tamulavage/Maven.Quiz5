package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    List<Student> studentList = new ArrayList<>();

    public void enroll(Student student) {
        studentList.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return studentList.contains(student);
    }

    public void lecture(double numberOfHours) {
        for(Student student: studentList){
            student.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map studentsMap = new TreeMap();
        Double hoursLearned ;
        for(Student student:studentList){
            hoursLearned = student.getTotalStudyTime();
            studentsMap.put(student, hoursLearned);
        }

        return studentsMap;
    }
}
