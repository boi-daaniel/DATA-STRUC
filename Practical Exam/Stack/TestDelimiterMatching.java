import java.util.Scanner;

public class TestDelimiterMatching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DelimiterMatcher delimiterMatcher = new DelimiterMatcher(100);

        System.out.print("Enter an expression: ");
        String expression = scanner.nextLine();

        boolean isMatched = delimiterMatcher.isDelimiterMatched(expression);
        if (isMatched) {
            System.out.println(expression + " - valid");
        } else {
            System.out.println(expression + " - invalid");
        }

        scanner.close();
    }
}