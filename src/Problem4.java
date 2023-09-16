/**
 * @author Yalesan Thayalan {@literal <yalesan2006@outlook.com>}
 */
public class Problem4 {
	public static void main(String[] args) {
		int n = 999;
		int largestPalindrome = 0;
		for (int i = 999; i > 100; i --) {
			for (int j = n; j > 100; j--) {
				int product = i*j;
				if (isPalindrome("" + product) && product > largestPalindrome) {
					largestPalindrome = product;
				}
			}
			n--;
		}
		System.out.println(largestPalindrome);
	}

	public static boolean isPalindrome(String s) {
		for (int i = 0; i < s.length()/2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
