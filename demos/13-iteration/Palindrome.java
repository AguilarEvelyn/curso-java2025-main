public class Palindrome {

    static boolean isPalindrome(String text) {
        String initialText = text.toLowerCase();
        String noSpacesText = ManageStrings.removeSpaces(initialText);
        String reverseText = ManageStrings.reverseString(noSpacesText);
        return noSpacesText.equals(reverseText);
    }

    static void showPalindromeInfo(String text) {
        String message = isPalindrome(text)
                ? " es palíndromo"
                : " NO es palíndromo";
        message = "\"" + text + "\"" + message;
        System.out.println(message);

    }

    public static void main(String[] args) {
        String textGood = "Atar a la rata";
        String textBad = "Atar al raton";
        showPalindromeInfo(textGood);
        showPalindromeInfo(textBad);
    }
}
