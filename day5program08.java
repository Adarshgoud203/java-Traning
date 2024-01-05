import java.util.Scanner;

class FrequencyDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Read the input string
        String str = sc.nextLine();

        int digitCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Check if the current character is a digit
            if (Character.isDigit(str.charAt(i))) {
                digitCount++;
            }
        }

        // Print the number of digits in the string
        System.out.println("Number of digits: " + digitCount);
    }
}