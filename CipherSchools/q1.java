import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter marks (0-100): ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer.");
            return;
        }

        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
        } else {
            String grade;
            if (marks >= 90) {
                grade = "A";
            } else if (marks >= 80) {
                grade = "B";
            } else if (marks >= 70) {
                grade = "C";
            } else if (marks >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println("Grade: " + grade);
        }
        
        sc.close();
    }
}
