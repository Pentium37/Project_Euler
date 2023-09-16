/**
 * @author Yalesan Thayalan {@literal <yalesan2006@outlook.com>}
 */
public class Problem1 {
	public static void main(String[] args) {
		int n = 1000;

		int threeLim = ((n-1) - ((n-1) % 3))/3;
		int fiveLim = ((n-1) - ((n-1) % 5))/5;
		int fifteenLim = ((n-1) - ((n-1) % 15))/15;

		double total = sum(threeLim, 3, 3) + sum(fiveLim, 5, 5) - sum(fifteenLim, 15, 15);
		System.out.println(total);
	}

	public static double sum(int n, int a, int d) {
		double nTerm = a-d + n*d;
		return ((a + nTerm)/2) * n;
	}
}
