package icpc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		File file = new File("A");
		Scanner sc = new Scanner(file);
		FileWriter writer = new FileWriter("answer"); 
		
		
		int line = 0;
				
		while ((line = sc.nextInt()) != 0) {
			int score[] = new int[line];
			int count = 0;
			int max = 1000001;
			
			for(int i=0; i<score.length; i++){
				score[i] = sc.nextInt();
			}
			
			
			Arrays.sort(score);
			
			for (int i = 0; i < line-1; i++) {
				count = score[i+1] - score[i];
				
				if(max > count){
					max = count;
				}
			}
			writer.write(max+"\r\n");
			writer.flush();
		}

		writer.close();
	}

}
