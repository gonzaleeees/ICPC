package icpc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		File file = new File("C");
//		Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);

		FileWriter writer = new FileWriter("answer");
		int count = 1;
		int m = sc.nextInt();
		int n = sc.nextInt();

		while (m != 0 || n != 0) {
			int a[] = new int[n];
			if (count == 1) {
				a[0] = m;
				m++;
			}

			for (int i = 0; i < count; i++) {
				if (m % a[i] == 0) {
					m++;
					i = 0;
				} else {
					if (count == n) {
						break;
					}
					a[count] = m;
					count++;
				}
				writer.write(m + "\r\n");

				m = sc.nextInt();
				n = sc.nextInt();
				count = 1;
			}
			writer.flush();
		}
	}

}
