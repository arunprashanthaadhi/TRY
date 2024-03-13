import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value which you want to reverse: ");
        String originalString = scanner.nextLine();
        String reversedString = new StringBuilder(originalString).reverse().toString();
        System.out.println("Reversed string: " + reversedString);
    }
}
