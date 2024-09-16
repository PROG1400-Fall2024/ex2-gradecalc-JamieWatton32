import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] grades = { "A", "B", "C", "D" };
        int[] numGrade = { 4, 3, 2, 1, 0 };

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Please enter your letter grade: ");
            String grade = sc.nextLine();

            if (grade.equals(grades[0])) {
                System.out.println("Your grade is: " + numGrade[0]);
            } else if (grade.equals(grades[1])) {
                System.out.println("Your grade is: " + numGrade[1]);
            } else if (grade.equals(grades[2])) {
                System.out.println("Your grade is: " + numGrade[2]);
            } else if (grade.equals(grades[3])) {
                System.out.println("Your grade is: " + numGrade[3]);
            } else {
                System.out.println("Invalid input!");
            }

        }

    }
}
