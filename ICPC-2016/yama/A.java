package icpc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class A {

	public static void main(String[] args) throws IOException {
		File file = new File("A2");
		Scanner sc = new Scanner(file);
		// Scanner sc = new Scanner(System.in);
		FileWriter fw = new FileWriter("answer");
		int all = sc.nextInt();
		int gap;
		int[] num;

		while (all != 0) {
			num = new int[all];
			gap = Integer.MAX_VALUE;

			for (int i = 0; i < all; i++) {
				num[i] = sc.nextInt();
			}

			Arrays.sort(num);

			for (int i = 1; i < all; i++) {
				if (gap > num[i] - num[i - 1])
					gap = num[i] - num[i - 1];
			}
			// System.out.println(gap);
			fw.write(gap + "\r\n");
			all = sc.nextInt();
		}

		fw.flush();
		fw.close();
		sc.close();
	}

}
