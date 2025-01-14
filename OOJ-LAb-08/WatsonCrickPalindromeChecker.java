public class WatsonCrickPalindromeChecker {
    public static boolean isWatsonCrickPalindrome(String dna) {
        String normalized = dna.toUpperCase();
        int left = 0;
        int right = normalized.length() - 1;
        while (left < right) {
            char leftChar = normalized.charAt(left);
            char rightChar = normalized.charAt(right);

            if (!isComplement(leftChar, rightChar)) {
                return false; 
            }
            left++;
            right--;
        }
        return true; 
    }
    private static boolean isComplement(char a, char b) {
        return (a == 'A' && b == 'T') ||
               (a == 'T' && b == 'A') ||
               (a == 'C' && b == 'G') ||
               (a == 'G' && b == 'C');
    }
    public static void main(String[] args) {
        String[] testStrings = {
            "ATCGCGAT", 
            "GATTACA", 
            "AGCTTCTGA", 
            "AAAATTTT",
            "ACGT"      
        };
        for (String test : testStrings) {
            System.out.println("\"" + test + "\" is a Watson-Crick complemented palindrome: " + isWatsonCrickPalindrome(test));
        }
    }
}
