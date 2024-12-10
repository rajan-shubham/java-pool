import java.util.Scanner;

public class FirstLasta {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input the string
            System.out.print("Enter a string (only 'a' and 'b' are allowed): ");
            String input = scanner.nextLine();

            // Validate the input
            if (!input.matches("[ab]*")) {
                System.out.println("Invalid input! The string must only contain 'a' and 'b'.");
            } else {
                // Run the state machine
                if (isAccepted(input)) {
                    System.out.println("Accepted: The string starts and ends with 'a'.");
                } else {
                    System.out.println("Rejected: The string does not start and end with 'a'.");
                }
            }
        }

        /**
         * State machine to check if a string starts and ends with 'a'
         * @param str The input string
         * @return true if the string starts and ends with 'a', false otherwise
         */
        public static boolean isAccepted(String str) {
            int currentState = 0;

            for (char ch : str.toCharArray()) {
                switch (currentState) {
                    case 0: // Initial state
                        if (ch == 'a') {
                            currentState = 1; // Transition to state 1
                        } else {
                            currentState = 3; // Transition to rejecting state
                        }
                        break;
                    case 1: // Valid initial 'a' found
                        if (ch == 'a' || ch == 'b') {
                            // Stay in state 1 for intermediate characters
                        }
                        break;
                    default:
                        return false; // Reject the string
                }
            }

            // Accept if the last character is 'a'
            return currentState == 1 && str.endsWith("a");
        }

}
