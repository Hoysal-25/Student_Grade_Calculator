import java.util.*;

public class StudentGradeCalculator {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║       Student Grade Calculator       ║");
        System.out.println("╚══════════════════════════════════════╝");

        int numSubjects = getPositiveInteger("Enter the number of subjects: ");
        List<Double> grades = new ArrayList<>();

        for (int i = 1; i <= numSubjects; i++) {
            double grade = getGradeInput("Enter grade for subject #" + i + " (0 - 100): ");
            grades.add(grade);
        }

        double average = calculateAverage(grades);
        String gradeCategory = getGradeCategory(average);

        System.out.println("\n══════════════ Results ══════════════");
        for (int i = 0; i < grades.size(); i++) {
            System.out.printf("Subject #%d: %.2f\n", i + 1, grades.get(i));
        }
        System.out.printf("Average Grade: %.2f\n", average);
        System.out.println("Grade Category: " + gradeCategory);
        System.out.println("═════════════════════════════════════");
    }

    private static int getPositiveInteger(String prompt) {
        int value;
        while (true) {
            try {
                System.out.print(prompt);
                value = Integer.parseInt(scanner.nextLine());
                if (value > 0) break;
                else System.out.println("Please enter a positive number.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        return value;
    }

    private static double getGradeInput(String prompt) {
        double grade;
        while (true) {
            try {
                System.out.print(prompt);
                grade = Double.parseDouble(scanner.nextLine());
                if (grade >= 0 && grade <= 100) break;
                else System.out.println("Grade must be between 0 and 100.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        return grade;
    }

    private static double calculateAverage(List<Double> grades) {
        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        return sum / grades.size();
    }

    private static String getGradeCategory(double average) {
        if (average >= 90) return "A+ (Excellent)";
        else if (average >= 80) return "A (Very Good)";
        else if (average >= 70) return "B (Good)";
        else if (average >= 60) return "C (Average)";
        else if (average >= 50) return "D (Pass)";
        else return "F (Fail)";
    }
}
