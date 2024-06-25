import java.util.Scanner;

public class IsOctal_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        String input = sc.nextLine();
        System.out.println("isOctal: " + isOctal(input));
    }

    public static boolean isOctal(String octal) {
        boolean isOctal = false;
        if (octal != null && !octal.isEmpty()) {
            int number = Integer.parseInt(octal);
            while (number > 0) {
                if (number % 10 <= 7) {
                    isOctal = true;
                } else {
                    isOctal = false;
                    break;
                }
                number /= 10;
            }
        }
        return isOctal;
    }
}
