import java.util.Arrays;

public class Student extends Person implements Reportable {

    private double[] marks = new double[5];

    public Student(String id, String name) {
        super(id, name);
    }

    public void addMark(int index, double mark) {
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
        marks[index] = mark;
    }

    public double calculateGPA() {
        double sum = 0;
        for (double m : marks) {
            sum += m;
        }
        return (sum / marks.length) / 10;
    }

    public String generateReport() {
        return "ID: " + getId() +
                "\nName: " + getName() +
                "\nMarks: " + Arrays.toString(marks) +
                "\nGPA: " + calculateGPA();
    }
}
