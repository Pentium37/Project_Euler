
public class Problem46 {
	public static void main(String[] args) {
		// c = p + x^2
		int i = 9;
		while (true) {
			i += 2;
			if (isPrime(i)) {
				continue;
			}
			if (!isGolbach(i)) {
				System.out.println(i);
				break;
			}
		}
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i < Math.round(Math.sqrt(n))+1; i++) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isGolbach(int n) {
		int i = 1;
		while(true) {
			int x = n - 2 * i * i;
			if (x < 1) {
				return false;
			}
			if (isPrime(x)) {
				return true;
			}
			i++;
		}
	}
}
