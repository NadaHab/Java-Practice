package chapter5;

public class PrimeNumber {

    public static void main(String[] args) {

        final int NUMBER_OF_PRIMES = 50; // Number of primes to display
        final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line

        int primeCounter = 0;  // Count the number of prime numbers
        int number = 2;        // A number to be tested for primeness

        System.out.println("The first 50 prime numbers are \n");

        // Repeatedly find prime numbers ======================================
        while (primeCounter < NUMBER_OF_PRIMES) {

            // Assume the number is prime
            boolean isPrime = true; // Is the current number prime?


            // Test if number is prime
            // Only positive divisor is 1 and number itself -------------------
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) { // If true, number is not prime
                    isPrime = false; // Set isPrime to false
                    break; // Exit the for loop
                }
            }
            //-----------------------------------------------------------------


            // Print the prime number and increase the primeCounter
            if (isPrime) {
                primeCounter++; // Increase the primeCounter

                if (primeCounter % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    // Print the number and advance to the new line,
                    // because this is 1oth number and we have to go to the next line
                    System.out.printf("%5d",number);
                    System.out.println("\n");
                } else
                    System.out.printf("%5d", number);
            }

            // Check if the next number is prime
            number++;
        }
        //=====================================================================
    }
}