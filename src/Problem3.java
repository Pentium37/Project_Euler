import java.lang.invoke.CallSite;
import java.util.List;
import modules.*;

/**
 * @author Yalesan Thayalan {@literal <yalesan2006@outlook.com>}
 */
public class Problem3 {
	public static void main(String[] args) {
		long n = 600851475143L;

		if (isPrime(n)) {
			System.out.println(n);
		} else  {
			long largestPrimeFactor = 2;
			for (long i = 2; i < Math.round(Math.sqrt(n))+1; i++) {
				if (n%i == 0 && isPrime(i)) {
					largestPrimeFactor = i;
				}
			}
			System.out.println(largestPrimeFactor);
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
}
