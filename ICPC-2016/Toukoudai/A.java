import java.util.*;

public class A {
  public static void main(String[] args) throws Exception{
    File file = new File("./A");
    Scanner scan = new Scanner(file);
    // 最小値の初期値
    int min = Integer.MAX_VALUE;

    while(true){
      int length = scan.nextInt();
      if(length == 0)break;

      // 値を受け取る
      int array[] = new int[length];
      for(int count = 0; count < length; count++){
        array[count] = scan.nextInt();
      }
      // 受け取った値をソートする。
      Array.sourt(array);

      for(int i = 0; i < length - 1; i++){
        // 隣同士を引算し、絶対値をとる。
        int def = Math.atoi(array[i] - array[i + 1]);
        // 差の絶対値を最小値と比較して、小さければ代入。
        if(min > def)min = def;
      }
    }
    // ぼやしみ～
    file.write(min);
    file.close();
  }
}