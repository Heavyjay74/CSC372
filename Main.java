package Module6CT;
import java.util.ArrayList;
public class Main {
    public static void main (String[] args)  {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Jason Smith", "261 Veterans Pkwy"));
        students.add(new Student(5, "Walter White", "3828 Piermont Drive"));
        students.add(new Student(8, "Hank Hill", "400 Rainey Street"));
        students.add(new Student(4, "Bruce Wayne", "224 Park Drive"));
        students.add(new Student(10, "Peter Parker", "20 Ingram Street"));
        students.add(new Student(3, "Bruce Banner", "314 Perfect Circle"));
        students.add(new Student(9, "Tony Stark", "10880 Malibu Point"));
        students.add(new Student(2, "Logan Howlett", "1407 Graymalkin Lane,"));
        students.add(new Student(7, "Wanda Maximoff", "2800 Sherwood Drive"));
        students.add(new Student(6, "Frank Castle", "2520 50th Avenue"));
        StudentSort.sortByRollno(students);
        //StudentSort.sortByName(students);
        for (Student s : students)  {
            System.out.printf("Roll Number: %d, Name: %s, Address: %s%n" ,s.rollno, s.name, s.address);
        }
    }
}
