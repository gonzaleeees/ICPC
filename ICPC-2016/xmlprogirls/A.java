package xml2016;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("A"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("aout.txt"));

		String num;

		int max = 0;
		int score[];
		int result = 1000000;
		while ((num = br.readLine()) != null) {
			if(Integer.parseInt(num) == 0){
				break;
			}
			String scores[] = br.readLine().split(" ");// score dainyuu
			score = new int[scores.length];
			for (int i = 0; i < score.length; i++) { // String -> int
				score[i] = Integer.parseInt(scores[i]);
			}




			for (int i = 0; i < Integer.parseInt(num); i++) { // hikaku
				for (int j = 0; j < Integer.parseInt(num); j++) {
					if (i != j) {
						//System.out.println(i +"   "+ j);
						int tmp;
						if (score[i] < score[j]) {
							tmp = score[j] - score[i];
						} else {
							tmp = score[i] - score[j];
						}
						if (tmp < result) {
							result = tmp;
						}
					}
				}
			}

			bw.write(result+"\n");

			System.out.println(result);
			result = 1000000;
		}

		bw.flush();
		bw.close();
	}
}
