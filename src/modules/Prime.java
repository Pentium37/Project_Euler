package modules;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Yalesan Thayalan {@literal <yalesan2006@outlook.com>}
 */
public class Prime {
	public static boolean isPrime(long n) {
		for (long i = 2; i < Math.round(Math.sqrt(n)) + 1; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	//The Sieve of Eratosthenes
	public static List<Long> esieve(long n) {
		List<Long> primes = new ArrayList<>();
		primes.add(2L);
		boolean continuation = false;
		for (long i = 3L; i <= n; i++) {
			continuation = false;
			for (long j : primes) {
				if (i % j == 0) {
					continuation = true;
				}
			}
			if (continuation) {
				continue;
			}
			primes.add(i);
		}
		return primes;
	}

	public static Map<Long, Long> getPrimeFactors(long n) {
		Map<Long, Long> primeFactors = new HashMap<>();
		List<Long> primes = esieve(n);
		for (long prime : primes) {
			while (true) {
				if (n % prime == 0 && !primeFactors
						.containsKey(prime)) {
					primeFactors.put(prime, 1L);
					n = n / prime;
				} else if (n % prime == 0) {
					primeFactors.replace(prime, primeFactors.get(prime) + 1);
					n = n / prime;
				} else {
					break;
				}
			}
		}

		return primeFactors;
	}
}

