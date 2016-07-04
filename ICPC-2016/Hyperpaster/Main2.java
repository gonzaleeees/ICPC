package icpc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main2 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		// TODO 自動生成されたメソッド・スタブ
		File file = new File("B");
		Scanner sc = new Scanner(file);
		FileWriter writer = new FileWriter("answer");

		int line = 0;
		int max = 0;
		int must = 0;
		int ans = 0;

		char al[] = new char[26];
		int alp[] = new int[26];

		while ((line = sc.nextInt()) != 0) {
			String A [] = new String[line];


			for(int i=0; i<al.length; i++){
				al[i] = (char)(65+i);
				alp[i] = 0;
			}

			for(int i=0; i<line; i++){
				A[i] = sc.next();
				char a = A[i].charAt(0);

				switch(a){
				case 'A':
					alp[0]++;
					break;
				case 'B':
					alp[1]++;
					break;
				case 'C':
					alp[2]++;
					break;
				case 'D':
					alp[3]++;
					break;
				case 'E':
					alp[4]++;
					break;
				case 'F':
					alp[5]++;
					break;
				case 'G':
					alp[6]++;
					break;
				case 'H':
					alp[7]++;
					break;
				case 'I':
					alp[8]++;
					break;
				case 'J':
					alp[9]++;
					break;
				case 'K':
					alp[10]++;
					break;
				case 'L':
					alp[11]++;
					break;
				case 'M':
					alp[12]++;
					break;
				case 'N':
					alp[13]++;
					break;
				case 'O':
					alp[14]++;
					break;
				case 'P':
					alp[15]++;
					break;
				case 'Q':
					alp[16]++;
					break;
				case 'R':
					alp[17]++;
					break;
				case 'S':
					alp[18]++;
					break;
				case 'T':
					alp[19]++;
					break;
				case 'U':
					alp[20]++;
					break;
				case 'V':
					alp[21]++;
					break;
				case 'W':
					alp[22]++;
					break;
				case 'X':
					alp[23]++;
					break;
				case 'Y':
					alp[24]++;
					break;
				case 'Z':
					alp[25]++;
					break;
				}

				int m=0,n=0;
				for(int y = 0; y < 26; y++){
					if(m < alp[y]){
						n = m;
						m = alp[y];
					}
				}

				for(int j=0; j<26; j++){
						if(alp[j] > line/2){
							must = j;
							ans = i;
							break;
						}
						else{
						for(int x=0; x<alp.length; i++){
							int nokori = line-i+1;

							if(m < alp[x]){
								m = alp[x];
								must = x;
								ans = i;
							}
						}
					}
				}

			}
			writer.write(al[must]+" "+ans+"\r\n");
			writer.flush();
			max = 0;
			must = 0;
			ans = 0;

			//al[must]; アルファベットの何が勝ったか
			//ans 何票目で決まったか

//			for(int j=0; j<al.length; j++){
//				al[j] = A[j].charAt(0);
//
//				for(int k=0; k<26; k++){
//					if(al[j] == (char)(65+k)){
//						alp[k]++;
//
//						if(alp[k] > line){
//							answer = al[j];
//							break;
//						}
//					}
//				}
//			}

		}

		writer.close();
	}

}
