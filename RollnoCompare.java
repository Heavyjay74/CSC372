package Module6CT;

import java.util.Comparator;

public class RollnoCompare implements Comparator{

    public int compare(Object o1, Object o2) {
        Student student1 = (Student) o1;
        Student student2 = (Student) o2;
        Integer int1 = Integer.valueOf(student1.rollno);
        Integer int2 = Integer.valueOf(student2.rollno);
        return int1.compareTo(int2);
    }
}
