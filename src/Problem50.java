import java.util.ArrayList;
import java.util.List;

/**
 * @author Yalesan Thayalan {@literal <yalesan2006@outlook.com>}
 */
public class Problem50 {

	// UNFINISHED PROBLEM
	public static void main(String[] args) {
		List<Integer> primes = primeGeneration(10000);
		long primeSum = 0;
		for (int i : primes) {
			primeSum += i;
			System.out.println("PRIME: " + i);
			if (isPrime(primeSum)) {
				if (primeSum > 1000) break;
				System.out.println(primeSum);
			}
		}
	}

	public static boolean isPrime(long n) {
		for (int i = 2; i < Math.round(Math.sqrt(n))+1; i++) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}
	public static List<Integer> primeGeneration(int n) {
		List<Integer> primes = new ArrayList<>();
		primes.add(2);
		boolean continuation = false;
		for (int i = 3; i <= n; i++) {
			continuation = false;
			for (int j : primes) {
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
}
