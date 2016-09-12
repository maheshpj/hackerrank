import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		String[] arr = s.split(" ");
		for (int i = count - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		sc.close();

	}

}
