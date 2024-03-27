
/**
 * Provides an implementation for the Eratosthene's sieve generator
 * <pre>
 * Date: 23AUG22
 * Course: csc 3102
 * Project # 0
 * Instructor: Dr. Duncan
 * </pre>
 */
import java.util.ArrayList;
import java.util.Arrays;
// DISCLAIMER: I DO NOT SUPPORT PEOPLE PLAGIARIZING OUR CODE. I DO NOT TAKE RESPONSIBILITY FOR THE UNLAWFUL ACTIONS OF OTHERS.
class EratosthenesUtil {
    /**
     * Generates a sequence of all primes less than or equal to the specified
     * parameter
     *
     * @param n the upperbound on the prime sequence
     * @return an array list containing all primes in [2,n] or an empty array
     * list if n < 2.
     */
    public static ArrayList<Long> sieve(long n) {
        //Implement this method

        if (n >= 2) {
            boolean[] isPrime = new boolean[(int) n + 1];
            ArrayList<Long> primes = new ArrayList<>();
            
            //fills isPrime array with true
            for (int i = 0; i <= n; i++) {
                isPrime[i] = true;
            }

            for (int i = 2; i * i <= n; i++) {//i*i is quicker than calculating root n
                if (isPrime[i]) {
                    for (int j = i * i; j <= n; j += i) {//goes over array and marks all multiples of 2
                        isPrime[j] = false;
                    }//for
                }//if
            }//for
            
            //adds primes to arraylist
            for (int i = 2; i <= n; i++){//arraylist is n+1 so this works
                if (isPrime[i]){
                   primes.add((long)i);
                }
            }
            return primes;
        }//if

        return new ArrayList<Long>();
    }

    /**
     * Gives a string representation of the specified array list of longs
     * enclosed in a pair of curly brackets and each adjacent pair of primes
     * separated by a comma followed by a space.
     *
     * @param v an array list of longs
     * @return a string representation of an array list of longs
     */
    public static String toString(ArrayList<Long> v) {
        //Implement this method
        if (v.size() != 0){
           String atr = "{";
           for (int i = 0; i < v.size()-1; i++){
               atr += v.get(i) + ", ";
           }
           atr += v.get(v.size()-1) + "}";
           
           return atr;
        }
        return "{}";
    }
}
