
package Practice7;
import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double AverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        Student student = new Student("John Doe");

        student.addGrade(85);
        student.addGrade(90);
        student.addGrade(75);

        System.out.println("Average grade for " + student.getName() + ": " + student.AverageGrade());
    }
}

/*class StudentClass {
    public static void main(String[] args) {
        Student student = new Student("John Doe");

        student.addGrade(85);
        student.addGrade(90);
        student.addGrade(75);

        System.out.println("Average grade for " + student.getName() + ": " + student.AverageGrade());
    }
}*/
