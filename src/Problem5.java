import modules.Prime;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Yalesan Thayalan {@literal <yalesan2006@outlook.com>}
 */
public class Problem5 {
	public static void main(String[] args) {
		Map<Long, Long> intersections = new HashMap<>();

		for (int i = 2; i <= 20; i++) {
			Map<Long, Long> primeFactors = Prime.getPrimeFactors(i);
			for (long prime : primeFactors.keySet()) {
				if (!intersections.containsKey(prime)) {
					intersections.put(prime, primeFactors.get(prime));
				} else {
					if (primeFactors.get(prime) > intersections.get(prime)) {
						intersections.replace(prime, primeFactors.get(prime));
					}
				}
			}
		}

		long n = 1;
		for (long prime : intersections.keySet()) {
			n *= Math.pow(prime, intersections.get(prime));
		}
		System.out.println(intersections);
		System.out.println(n);
	}

}
