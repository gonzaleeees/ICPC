import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception{
        File file = new File("./B");
        Scanner scan = new Scanner(file);

        while(true){
            int ans[] = new int[28];// A~Z(27)とそれ以外を1つまで
            int first = 27, second = 27;

            int hyou = scan.nextInt();
            if(hyou == 0)break;

            int ck_num = hyou;
            for(int i=0;i<ck_num;i++){
                // 投票処理
                int vote = (int)scan.next().charAt(0) - 65;//asciiを配列の添字に合わせる
                ans[vote]++;
                hyou--;

                // 順位入れ替え処理
                if(vote != first){
                    if(ans[first] < ans[vote]){
                        second = first;
                        first = vote;
                    }else if(ans[second] < ans[vote]){
                        second = vote;
                    }
                }

                // 票差をチェック
                if(ans[first] > ans[second] + hyou){
                    System.out.print((char)(first+65) + " " + (ck_num - hyou) + " ");

                    break;
                }else if(hyou == 0 && ans[first] == ans[second]){
                    System.out.print("TIE");
                }
            }
            scan.nextLine();
            System.out.println("");
        }
    }
}
