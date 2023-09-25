package Module6CT;
import java.util.ArrayList;
public class StudentSort {
    public static ArrayList<Student> sortByRollno (ArrayList<Student> input)  {
        int smallest = 0;
        for (int i = 0; i < input.size(); i++)  {
            smallest = i;
            for (int j = i + 1; j < input.size(); j++)  {
                RollnoCompare rc = new RollnoCompare();
                if (rc.compare(input.get(i), input.get(j)) > 0) {
                    Student temp = input.get(i);
                    input.set (i, input.get(j));
                    input.set (j, temp);
                }
            }
        }
        return input;
    }
    public static ArrayList<Student> sortByName (ArrayList<Student> input)  {
        int smallest = 0;
        for (int i = 0; i < input.size(); i++)  {
            smallest = i;
            for (int j = i + 1; j < input.size(); j++)  {
                NameCompare nc = new NameCompare();
                if (nc.compare(input.get(i), input.get(j)) > 0) {
                    Student temp = input.get(i);
                    input.set (i, input.get(j));
                    input.set (j, temp);
                }
            }
        }
        return input;
    }
}
