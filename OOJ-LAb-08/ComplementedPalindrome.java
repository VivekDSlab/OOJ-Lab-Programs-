public class ComplementedPalindrome {
    public static String longestComplementedPalindrome(String dna) {
        int n = dna.length();
        if (n == 0) return "";
        String longestPalindrome = "";
        char complement(char c) {
            switch (c) {
                case 'A': return 'T';
                case 'T': return 'A';
                case 'C': return 'G';
                case 'G': return 'C';
                default: return c;
            }
        }
        String expandAroundCenter(String s, int left, int right) {
            while (left >= 0 && right < s.length() &&
                    complement(s.charAt(left)) == s.charAt(right)) {
                left--;
                right++;
            }
            return s.substring(left + 1, right);
        }
        for (int i = 0; i < n; i++) {
            String oddPalindrome = expandAroundCenter(dna, i, i);
            if (oddPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = oddPalindrome;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            String evenPalindrome = expandAroundCenter(dna, i, i + 1);
            if (evenPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = evenPalindrome;
            }
        }
        return longestPalindrome;
    }
    public static void main(String[] args) {
        String dna = "GACACGGTTTTA";
        String result = longestComplementedPalindrome(dna);
        System.out.println("Longest complemented palindrome: " + result);
    }
}
