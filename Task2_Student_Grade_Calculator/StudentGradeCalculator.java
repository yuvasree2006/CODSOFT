import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subjects;
        double marks, total = 0, average;

        System.out.print("Enter number of subjects: ");
        subjects = sc.nextInt();

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            marks = sc.nextDouble();
            total += marks;
        }

        average = total / subjects;

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Percentage: " + average + "%");

        if (average >= 90)
            System.out.println("Grade: A");
        else if (average >= 75)
            System.out.println("Grade: B");
        else if (average >= 60)
            System.out.println("Grade: C");
        else if (average >= 40)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");

        sc.close();
    }
}
