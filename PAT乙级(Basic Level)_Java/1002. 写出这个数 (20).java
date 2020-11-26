package pat.Basic._1002;


/**
 * Created by IntelliJ IDEA.
 *
 * @Author: 张志浩  Zhang Zhihao
 * @Email: 3382885270@qq.com
 * @Date: 2020/4/29
 * @Time: 21:53
 * @Version: 1.0
 */

import java.util.Scanner;

public class 写出这个数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char[] chars1 = n.toCharArray();
        int sum = 0;
        for (char i : chars1) {
            sum += i - '0';
        }
        String str = String.valueOf(sum);
        char[] chars2 = str.toCharArray();
        String[] PinYin = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
        for (int i = 0; i < chars2.length - 1; i++) {
            System.out.print(PinYin[chars2[i] - '0'] + " ");
        }
        System.out.print(PinYin[chars2[chars2.length - 1] - '0']);

        sc.close();
    }
}
