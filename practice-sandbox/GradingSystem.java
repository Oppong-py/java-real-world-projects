import java.util.Scanner;

public class GradingSystem {

    static final int EXAM_PASS_MARK = 25;
    static final int ASSESSMENT_PASS_MARK = 15;
    static final int CONDONE_TOTAL = 39;
    static final double FULL_FEE = 100;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        double exam = readScore(input, "Enter exam score: ");
        double assessment = readScore(input, "Enter assessment score: ");
        double feesPaid = readScore(input, "Enter fees paid (full fee is 100): ");

        double total = exam + assessment;

        boolean passedExam = exam >= EXAM_PASS_MARK;
        boolean passedAssessment = assessment >= ASSESSMENT_PASS_MARK;

        // Req. 1: must pass both components
        boolean req1 = passedExam && passedAssessment;
        // Req. 2: total of at least 39 across both components
        boolean req2 = total >= CONDONE_TOTAL;
        boolean paidInFull = feesPaid >= FULL_FEE;

        System.out.println("\n===== RESULT FOR " + name.toUpperCase() + " =====");
        System.out.println("Exam score       : " + exam + (passedExam ? "  -> PASSED" : "  -> FAILED"));
        System.out.println("Assessment score : " + assessment + (passedAssessment ? "  -> PASSED" : "  -> FAILED"));
        System.out.println("Total            : " + total);
        System.out.println("---------------------------------");

        if (req1 && req2) {
            System.out.println("Status: PASSED");
            if (paidInFull) {
                System.out.println("Congratulations! You have been issued a CERTIFICATE.");
            } else {
                System.out.println("No certificate issued: fees not paid in full (balance: "
                        + (FULL_FEE - feesPaid) + ").");
            }
        } else if (req2) {
            // Did not pass both components, but total meets the condonement mark
            System.out.println("Status: CONDONED (total of " + total + " meets the " + CONDONE_TOTAL + " mark).");
            System.out.println("No certificate issued, since Requirement 1 was not met.");
        } else {
            System.out.println("Status: FAILED");
        }

        // Req. 5: tell the student which component was passed/failed (already shown above)
        System.out.println("\nComponent summary:");
        System.out.println(" - Exam       : " + (passedExam ? "Passed" : "Failed"));
        System.out.println(" - Assessment : " + (passedAssessment ? "Passed" : "Failed"));

        // Req. 6: failed both components -> repeat
        if (!passedExam && !passedAssessment) {
            System.out.println("\nYou failed both components. You are required to REPEAT.");
        }

        input.close();
    }

    // Reads a non-negative number, re-asking on invalid input
    static double readScore(Scanner input, String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            if (input.hasNextDouble()) {
                value = input.nextDouble();
                if (value >= 0) {
                    input.nextLine(); // clear newline
                    return value;
                }
            } else {
                input.next(); // discard invalid token
            }
            System.out.println("Invalid input. Please enter a non-negative number.");
        }
    }
}
