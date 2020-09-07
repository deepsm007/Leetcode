/**
 * 
 */
package com.deepsm007;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Deep Mistry
 *
 */
public class CountPrimes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(countPrimes(100));
		System.out.println(countPrimesUsingStream(100));
		
	}

	public static int countPrimes(int n) {

		int count = 0;
		boolean prime[] = new boolean[n + 1];
		for (int i = 2; i < n; i++)
			prime[i] = true;

		for (int p = 2; p * p <= n; p++) {
			if (prime[p] == true) {
				// Update all multiples of p
				for (int i = p * p; i <= n; i += p)
					prime[i] = false;
			}
		}

		// Print all prime numbers
		for (int i = 2; i <= n; i++) {
			if (prime[i] == true)
				count++;
		}

		return count;
	}

	public static int countPrimesUsingStream(int n) {

		  List<Integer> primes = new ArrayList<>(); 
		  IntStream.range(2, n).filter(x -> primes.parallelStream()
				  									.noneMatch(p -> x % p == 0))
		  											  .forEach(primes::add);
		  return primes.size();

	}

}
