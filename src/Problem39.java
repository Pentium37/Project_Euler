import java.util.HashMap;
import java.util.Map;

/**
 * @author Yalesan Thayalan {@literal <yalesan2006@outlook.com>}
 */
public class Problem39 {

	public static void main(String[] args) {
		// a ^2 + b^2 = c^2
		Map<Integer, Integer> sumCount = new HashMap<>();
		for (int a = 1; a < 1000; a++) {
			for (int b = 1; b < 1000; b++) {
				double c = Math.sqrt(a*a + b*b);
				if ((int) c ==  c) {
					int sum = a + b + (int) c;
					if (!sumCount.containsKey(sum)) {
						sumCount.put(sum, 1);
					} else {
						sumCount.replace(sum, sumCount.get(sum)+1);
					}
				}

			}
		}

		int max = 0;
		for (int i : sumCount.keySet()) {
			if (sumCount.get(i) > max && i < 1000) {
				max = i;
			}
		}
		System.out.println(max);
	}

}
