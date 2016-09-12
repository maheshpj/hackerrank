import java.util.stream.IntStream;

public class Staircase {

	public static void main(String[] args) {
		int n = 6;

		IntStream.rangeClosed(1, n).forEach(o -> Staircase.print(o, n));
	}

	public static void print(int e, int n) {
		String[] str = new String[] { " ", " ", " ", " ", " ", " " };
		for (int i = n - 1; i >= n - e; i--) {
			str[i] = "#";
		}
		System.out.println(String.join("", str));
	}

}
