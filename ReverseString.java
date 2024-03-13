public class ReverseString {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String reversedString = new StringBuilder(originalString).reverse().toString();
        System.out.println("Reversed string: " + reversedString);
    }
}
