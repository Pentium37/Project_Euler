/**
 * @author Yalesan Thayalan {@literal <yalesan2006@outlook.com>}
 */
public class Problem2 {
	public static void main(String[] args) {
		// ( 1 + r5 )  / 2

		final double goldenRatioS = (1 + Math.sqrt(5)) / 2 ;
		long exceed = 4000000;
		int runningSum = 0;
		int n = 3;
		double currentTerm = 0;

		while (true) {
			currentTerm = ((Math.pow(goldenRatioS, n) - Math.pow(-1 * goldenRatioS, -1 * n)) / Math.sqrt(5));
			if (currentTerm > exceed) break;
			runningSum += currentTerm;
			n += 3;
		}
		System.out.println(runningSum);
	}
}
