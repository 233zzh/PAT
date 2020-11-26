package pat.Basic._1006;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: 张志浩 Zhang Zhihao
 * @Email: 3382885270@qq.com
 * @Date: 2020/11/26
 * @Time: 21:36
 * @Version: 1.0
 * @Description: Description
 */
public class Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int B = n / 100;
        int S = n % 100 / 10;
        int G = n % 100 % 10;
//        System.out.println(B+" "+S+" "+G);
        StringBuilder result = new StringBuilder();
        while (B-- > 0) {
            result.append('B');
        }
        while (S-- > 0) {
            result.append('S');
        }
        for (int i = 1; i <= G; i++) {
            result.append(i);
        }
        System.out.println(result);
    }
}
