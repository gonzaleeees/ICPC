package xml2016;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class B {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("B"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("bout.txt"));

		String nums;



		List<String> result_who = new ArrayList();
		String result = "";
		int resultnum = 0;

		while((nums = br.readLine()) != null){
			HashMap map = new HashMap();
			int num;
			String[] who;
			List<String> key = new ArrayList<>();


			if(Integer.parseInt(nums) == 0){
				break;
			}

			num = Integer.parseInt(nums); // touhyousuu
			who = br.readLine().split(" "); // hyou wo wakeru

			//System.out.println(who[0]+"name");

			for(int i = 0; i<who.length; i++){
				//System.out.println(i);
				Object hyou ;
				//if(i == 0){
				//	hyou = map.get(who[i]);
				//}else{
					hyou = map.get(who[i]);
				//}
				//System.out.println(map.get(who[i]));

				if(hyou == null){
					map.put(who[i], 1);
					key.add(who[i]);
				}else{
					String hyous = hyou.toString();
					int tokuhyou = Integer.parseInt(hyous);

					tokuhyou++;
					map.put(who[i], tokuhyou);
				}
				List<String> result_whos = new ArrayList<>();

				int min = 100;
				int max = 0;
				for(int j = 0; j<map.size(); j++){
					//System.out.println(j);
					String keys= key.get(j);
					int tmp = (int)map.get(keys);
					if(max <= tmp){
						max = tmp;

						//System.out.println(keys);
						result_whos.add(keys);
					}
					if(min > tmp){
						min = tmp;
					}
				}
				int samax = 0;
				for(int j=0; j<map.size(); j++){
					if(key.get(j).equals(result_who)){
						break;
					}
					int tmp = max - (int)map.get(key.get(j));
					if(samax < tmp){
						samax = tmp;
					}
				}

				if(((min+(who.length-i)) < max-1) && ((samax+(who.length-i)) < max-1)){
					result_who = result_whos;
					resultnum = i+1;
					break;
				}
				result_who = result_whos;
				resultnum = i+1;
			}
			if(result_who.size() != 1){
				System.out.println("TIE");
				bw.write("TIE\n");

			}else{
				bw.write(result_who.get(0) +" "+ resultnum+"\n");
			}

		}



		//bw.write(""+max);
		bw.flush();
		bw.close();
	}

}
