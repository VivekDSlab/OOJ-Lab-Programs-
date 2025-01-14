public class ReverseComplementDNA {
    public static String reverseComplement(String dna) {
        String normalized = dna.toUpperCase();
        StringBuilder result = new StringBuilder();
        for (int i = normalized.length() - 1; i >= 0; i--) {
            char complement = getComplement(normalized.charAt(i));
            result.append(complement);
        }
        return result.toString();
    }
    private static char getComplement(char base) {
        switch (base) {
            case 'A': return 'T';
            case 'T': return 'A';
            case 'C': return 'G';
            case 'G': return 'C';
            default: throw new IllegalArgumentException("Invalid DNA character: " + base);
        }
    }

    public static void main(String[] args) {
        // Test cases
        String[] testStrings = {
            "ACGGAT", 
            "GATTACA", 
            "AAAA",   
            "CGTA",  
            "TGCAT"   
        };

        for (String test : testStrings) {
            System.out.println("Reverse complement of \"" + test + "\": " + reverseComplement(test));
        }
    }
}
