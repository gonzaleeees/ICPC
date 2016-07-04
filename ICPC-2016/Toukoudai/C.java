import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kazuki on 16/06/24.
 */
public class C {
    public static void main(String[] args) throws Exception {
        File f = new File("/home/kazuki/Workspace/uni/icpc/src/C/C");
        Scanner scan = new Scanner(f);
        FileWriter fw = new FileWriter(new File("/home/kazuki/Workspace/uni/icpc/src/C/out.txt"));

        int age = scan.nextInt();
        int areaNum = scan.nextInt();
        ArrayList<Integer> data = new ArrayList<>();
        for (int i = age; i < (age + areaNum + 1) * 3; i++) {
            data.add(i);
        }
        for (int i = 0; i < areaNum; i++) {
            for (int j = 1; j < data.size(); j++) {
                if (data.get(j) % data.get(0) == 0) {
                    data.remove(j--);
                    int tmp = data.get(data.size() - 1) + 1;
                    data.add(tmp);
                }
            }
            data.remove(0);
        }
        System.out.println(data.get(0));


//        while (true) {
//            int age = scan.nextInt();
//            int areaNum = scan.nextInt();
//            if (age == 0 && areaNum == 0) break;
//
////        ArrayList<Integer> area = new ArrayList<Integer>();
//            int area[] = new int[areaNum];
//            area[0] = age;
//            int c = 1;
//            while (true) {
////            if (area.size() == areaNum) break;
//                if (c > areaNum){
//                    break;
//                };
//                age++;
//                for (int i=0;i < areaNum;i++) {
//                    if (area[i] == 0) {
//                        area[c] = age;
//                        c++;
//                        break;
//                    }
//                    if (age % area[i] == 0) {
//                        break;
//                    }
//                    if(i == areaNum-1){
//                        c++;
//                        break;
//                    }
//                }
//            }
//            System.out.println(age);
//        }
        fw.close();
    }
}
