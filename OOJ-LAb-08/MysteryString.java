public class MysteryString {

    public static String mystery(int N) {
        String s = "";
        while (N > 0) { 
            if (N % 2 == 1) { 
                s = s + s + "x"; 
            } else { 
                s = s + s; 
            }
            N = N / 2; 
        }
        return s;
    }

    public static void main(String[] args) {
        int N = 5; 
        System.out.println("Result for N = " + N + ": " + mystery(N));
        N = 6; 
        System.out.println("Result for N = " + N + ": " + mystery(N));
    }
}
