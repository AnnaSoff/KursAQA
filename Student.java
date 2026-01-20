import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }
    public String getName() { return name; }
    public String getGroup() { return group;}
    public int getCourse() { return course; }
    public void setCourse(int course) { this.course = course; }

    public double getAverageGrade() {
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public static void listOfStudents(List<Student> students) {
        Iterator <Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }
    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты на " + course + " курсе:");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Анна", "18", 1, Arrays.asList(4, 5, 3)));
        students.add(new Student("Алексей", "14", 4, Arrays.asList(2, 2, 3)));
        students.add(new Student("Ольга", "12", 2, Arrays.asList(2, 3, 3)));
        students.add(new Student("Лев", "14", 4, Arrays.asList(5, 5, 5)));
        students.add(new Student("Евгения", "17", 2, Arrays.asList(5, 5, 5)));

  
        Student.listOfStudents(students);
        Student.printStudents((List<Student>) students, 3);
    }
}


