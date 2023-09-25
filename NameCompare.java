package Module6CT;

import java.util.*;

public class NameCompare implements Comparator {

    public int compare(Object object1, Object object2)  {

        Student student1 = (Student) object1;
        Student student2 = (Student) object2;
        return student1.name.compareTo(student2.name);
    }
}
