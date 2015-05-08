package atCodeGW;

import java.util.ArrayList;
import java.util.Collections;

public class A {
	// 全体で使いたいものなのでstatic
	static ArrayList<Integer> al = new ArrayList<>();//G問題以外の数値
	static ArrayList<Integer> complete = new ArrayList<>();//完成版を詰め込むところ
	static int[] points = { 25, 39, 51, 76, 163, 111, 128, 133, 138 };// G問題の点数だけ抜いてあります。

	public static void main(String[] args) {
		int posi = 0;//深さ
		int num = 0;//合計値

		func(posi, num);

		// G問題の場合だけこちらで処理
		/* 0点取得の場合 */
		for (int i = 0; i < al.size(); i++) {
			complete.add(al.get(i) + 0);
		}
		/* 58点取得の場合 */
		for (int i = 0; i < al.size(); i++) {
			complete.add(al.get(i) + 58);
		}
		/* 136点取得の場合 */
		for (int i = 0; i < al.size(); i++) {
			complete.add(al.get(i) + 136);
		}

		Collections.sort(complete);// 小さい順に並べ替え

		// かぶってる数字を削除する処理
		int tmp = -1;/* 負の数に初期化すれば0を削除されない */
		for (int i = 0; i < complete.size(); i++) {
			if (tmp == complete.get(i)) {
				// System.out.println(tmp+":"+complete.get(i));
				complete.remove(i);
				i--;
			} else {
				tmp = complete.get(i);
			}
		}

		for (int i = 0; i < complete.size(); i++) {
			System.out.println(complete.get(i));
		}
	}

	// 木構造で探索
	/*
	 * 　　　　　　      　0 
	 * 　　　　　     　/　 　\ 
	 * 　　　　　      25 　　0 
	 * 　　　　       /　 \　/ \
	 *      39 0 39 0 
	 *    ............. 
	 *    .............
	 *   /             \
	 *  138             0
	 */
	public static void func(int posi, int num) {
		if (posi == points.length) {
			al.add(num);
		} else {
			func(posi + 1, num);// 0点の場合
			num += points[posi];
			func(posi + 1, num);// 点数を取得できている場合
		}
	}

}
