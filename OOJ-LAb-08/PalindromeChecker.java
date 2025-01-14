public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = normalized.length() - 1;
        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] testStrings = {
            "racecar", 
            "A man a plan a canal Panama", 
            "hello", 
            "madam", 
            "Was it a car or a cat I saw"
        };

        for (String test : testStrings) {
            System.out.println("\"" + test + "\" is a palindrome: " + isPalindrome(test));
        }
    }
}
