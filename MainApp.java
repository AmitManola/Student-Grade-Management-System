import java.util.*;

public class MainApp {
    static Scanner sc = new Scanner(System.in);
    static GradeBook gradeBook = new GradeBook();

    public static void main(String[] args) {

        System.out.println("===== Student Grade Book =====");

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Enter Marks");
            System.out.println("3. Calculate GPA");
            System.out.println("4. Exit");

            // int choice = sc.nextInt();
            int choice;
try {
    choice = sc.nextInt();
} catch (InputMismatchException e) {
    System.out.println("Invalid input! Please enter a number.");
    sc.next(); // clear wrong input
    continue;
}

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = sc.next();
                    System.out.print("Name: ");
                    String name = sc.next();
                    gradeBook.addStudent(new Student(id, name));
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    Student s = gradeBook.searchStudent(sc.next());
                    if (s != null) {
                        for (int i = 0; i < 5; i++) {
                            System.out.print("Mark " + (i + 1) + ": ");
                            s.addMark(i, sc.nextDouble());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    Student st = gradeBook.searchStudent(sc.next());
                    if (st != null) {
                        System.out.println("GPA: " + st.calculateGPA());
                    }
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
