import java.io.*;
import java.util.*;
class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("B"));
		String inp = null;
		while(!(inp = br.readLine()).equals("0")){
			Map<String, Integer> map = new HashMap<>();
			Set<String> al = new HashSet<>();
			int n = Integer.parseInt(inp);
			// System.out.println(n);
			String[] hyo = br.readLine().split(" ");
			int half = n / 2 + 1;
			int count = 0;
			int max = 0;
			int tmp = 0;
			int tmp2 = 0;
			int nokori = n;
			boolean ok = true;
			boolean forc = true;
			boolean allok = false;
			int result = 0;
			String target = hyo[0];
			for(String s: hyo){
				count++;
				if(al.contains(s)){
					map.put(s, map.get(s) + 1);
				}else map.put(s, 1);
				al.add(s);
				nokori--;
				tmp = map.get(s);
				if(max < tmp){
					max = tmp;
					target = s;
				}
				if(count >= half){
					tmp2 = max - nokori;
					for(String ss: al){
						if(ss.equals(target)) continue;
						//System.out.print(nokori);
						//System.out.print("ok");
						//System.out.print(tmp2);
						//System.out.print(" ");
						//System.out.println(map.get(ss));
						if(tmp2 <= map.get(ss)){
							ok = false;
							forc = false;
							break;
						}
					}
					if(forc) ok = true;
				}else ok = false;
				if(ok){
					System.out.printf("%s ", target);
					System.out.println(count);
					allok = true;
					break;
				}
				ok = true;
				forc = true;
				// System.out.println(map);
				// System.out.print(nokori);
				// System.out.print(" ");
				// System.out.print(half);
			}
			// System.out.println(map);
			if(!allok){
				System.out.println("TIE");
				allok = false;
			}
		}
	}
}
