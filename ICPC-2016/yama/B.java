package icpc;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class B {

	public static void main(String[] args) throws IOException {
		File file = new File("B1");
		Scanner sc = new Scanner(file);
		// Scanner sc = new Scanner(System.in);
		FileWriter fw = new FileWriter("answer");
		int num = sc.nextInt();
		int[] cAry;
		int count;
		int fir, sec, fNum;
		int ans;
		String[] rep; // representative 代表
		String str;

		while (num != 0) {
			rep = new String[num];
			cAry = new int[num];
			str = sc.next();
			rep[0] = str;

			count = 0;
			fir = 0;
			sec = 0;
			fNum = 0;
			for (int i = 0; i < num; i++) {

				for (int j = 0; j < count + 1; j++) {
					if (str.equals(rep[j])) {
						cAry[j]++;
						// System.out.println("cAry[" + j + "]");
						// System.out.println(rep[j]);
						// System.out.println(cAry[j]);

						if (fir <= cAry[j]) {
							if (fNum != j) {
								sec = fir;
								fir = cAry[j];
								fNum = j;
							} else
								fir = cAry[j];
						} else if (sec <= cAry[j]) {
							sec = cAry[j];
						}

						if (num - 1 == i && fir == sec) {
							// System.out.println("TIE");
							fw.write("TIE\r\n");
						}
						if (fir - sec >= num - i) {
							// System.out.println("f:" + fir);
							// System.out.println("s:" + sec);
							str = sc.nextLine();
							ans = i + 1;
							i = num - 1;
							fw.write(rep[fNum] + " " + ans + "\r\n");
						}
						break;
					} else if (j == count) {
						count++;
						rep[count] = str;
					}

				}
				if (i != num - 1)
					str = sc.next();
			}
			num = sc.nextInt();

		}
		fw.flush();
		fw.close();
		sc.close();

	}
}