// DISCLAIMER: I DO NOT SUPPORT PEOPLE PLAGIARIZING OUR CODE. I DO NOT TAKE RESPONSIBILITY FOR THE UNLAWFUL ACTIONS OF OTHERS.
/**
 * A program to profile the Eratosthene's Sieve prime generator
 * and compare the exact value of the prime-counting function and
 * the n/ln(n) approximation.
 * @see EratosthenesUtil
 * <pre>
 * Date: 23AUG22
 * Project # 0
 * Instructor: Dr. Duncan
 * </pre>
 */

import java.util.ArrayList;
import java.util.Scanner;

public class EratosthenesProfiler
{
	public static void main(String[] args) 
	{
		//Implement this method
                Scanner in = new Scanner(System.in);
                System.out.println("Enter an integer n to generate primes in [2,n].");
                long foo = Long.parseLong(in.nextLine());
                System.out.printf("User input: %d%n", foo);
                long clock = System.nanoTime()/1000;//1000 nanoseconds in a microsecond
                ArrayList<Long> primes = EratosthenesUtil.sieve(foo);
                long clock2 = System.nanoTime()/1000;//1000 nanoseconds in a microsecond
                System.out.printf("P(%d) = %s%n", foo, EratosthenesUtil.toString(primes));
                System.out.printf("Prime fetch time: %d microseconds%n", clock2 - clock);
                System.out.printf("pi(%d) = %d%n", foo, primes.size());
	}   
}
