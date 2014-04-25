import java.util.Scanner;
import java.util.Arrays;

public class Dseer {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] t = new int[n];
		for (int i = 0; i < n; i++) {
			t[i] = s.nextInt();
		}
		Arrays.sort(t);
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				sum += t[j];
			}
		}
		System.out.println(sum);
		s.close();
	}
}