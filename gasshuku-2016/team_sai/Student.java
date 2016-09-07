package team_sai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private static List<Integer> studentNumber = new ArrayList<Integer>();

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            studentNumber.add(i + 1);
        }
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            for (int i = 0; i < 28; i++) {
                int n = sc.nextInt();
                int a = studentNumber.indexOf(n);
                studentNumber.remove(a);
            }
            for (int i = 0; i < studentNumber.size(); i++) {
                System.out.println(studentNumber.get(i));
            }
        }
    }
}
