import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayDifference {

	public static void main(String[] args) {
		int[] a = new int[] { 10, 9, 8, 5, 3, 3 };

		List<Integer> intList = new ArrayList<Integer>();
		for (int index = 0; index < a.length; index++) {
			intList.add(a[index]);
		}

		System.out.println(test(intList));
	}

	public static int test(List<Integer> intList) {
		if (intList == null || intList.isEmpty()) {
			return -1;
		}
		Integer p = Collections.max(intList);
		int indp = intList.indexOf(p);
		if (indp != 0) {
			Integer q = Collections.min(intList.subList(0, indp));
			return p - q;
		} 
		return test(intList.subList(1, intList.size()));
	}
}
