package chapter5;

public class GreatestCommonDivisor {

    private static void gcdCalculator(int n1, int n2) {

        int gcd = 1;
        int gcdCandidate = 2;

        while (gcdCandidate <= n1 && gcdCandidate <= n2) {

            if (n1 % gcdCandidate == 0 && n2 % gcdCandidate == 0)
                gcd = gcdCandidate;

            gcdCandidate++;
        }
        System.out.println("gcdCalculator: The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
    }

    // Decrement from Math.min(n1,n2) by while loop
    public static void gcdCalculator_I(int n1, int n2){

        int gcd = 1;
        int gcdCandidate = Math.min(n1,n2);

        while (gcdCandidate >= 2) {
            if (n1 % gcdCandidate == 0 && n2 % gcdCandidate == 0){
                gcd = gcdCandidate;
                break;
            }
            gcdCandidate--;
        }
        System.out.println("gcdCalculator_I: The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
    }

    // Decrement from Math.min(n1,n2) by for loop
    public static void gcdCalculator_II(int n1, int n2){

        int gcdCandidate = Math.min(n1,n2);

        for (int i = gcdCandidate; i >= 2; i--) {
            if (n1 % i == 0 && n2 % i == 0){
                gcdCandidate = i;
                break;
            }
        }
        System.out.println("gcdCalculator_II: The greatest common divisor for " + n1 + " and " + n2 + " is " + gcdCandidate);
    }

    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 18;

        gcdCalculator(n1, n2);
        gcdCalculator_I(n1, n2);
        gcdCalculator_II(n1, n2);
    }
}