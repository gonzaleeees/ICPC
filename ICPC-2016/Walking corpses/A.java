package g5;

import java.util.Arrays;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;




		while (true) {


			int b = 1000000;


			int N = sc.nextInt();
			int M[] = new int[N];


			for (int i = 0; i < N; i++) {
				M[i] = sc.nextInt();
			}
			Arrays.sort(M);
			for (int i = N - 1; i > 0; i--) {
				int a = M[i] - M[i - 1];
				b = Math.min(a, b);

				ans = b;


			}
			if (N == 0) {
				break;

			}

			System.out.println(ans);
		}

	}
}
