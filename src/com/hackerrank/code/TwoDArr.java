import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;

public class TwoDArr {
	
	/* Input
	 	* 1 1 1 0 0 0
		* 0 1 0 0 0 0
		* 1 1 1 0 0 0
		* 0 0 2 4 4 0
		* 0 0 0 2 0 0
		* 0 0 1 2 4 0
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//in.nextLine();
		
		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			String s = in.nextLine();
			String linearr[] = s.split(" "); 
			for(int j = 0; j < 6; j++) {
				arr[i][j] = Integer.parseInt(linearr[j]);
			}
		}
		in.close();
		
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int[] a = new int[7];
				a[0] = arr[i][j];
				a[4] = arr[i][j + 1];
				a[3] = arr[i][j + 2];

				a[2] = arr[i + 2][j + 2];
				a[5] = arr[i + 2][j];
				a[6] = arr[i + 2][j + 1];

				a[1] = arr[i + 1][j + 1];

				int sum = sum(a);
				if (sum > maxSum) {
					maxSum = sum;
				}
			}
		}
		System.out.println(" Max: " + maxSum);
	}

	public static int sum(int[] intarr) {
		return Arrays.stream(intarr).sum();
	}

}
