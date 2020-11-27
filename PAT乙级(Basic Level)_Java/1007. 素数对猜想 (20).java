package pat.Basic._1007;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: 张志浩 Zhang Zhihao
 * @Email: 3382885270@qq.com
 * @Date: 2020/11/26
 * @Time: 22:08
 * @Version: 1.0
 * @Description: Description
 */
public class Prime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int first_prime = 2;
        int count = 0;
        for (int i = 3; i <= N; i++) {
            int j;
            int temp = (int) Math.sqrt(i);
            for (j = 2; j <= temp; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == (temp + 1)) {
//                System.out.println(i);
                if ((i - first_prime) == 2) {
                    count++;
                }
                first_prime = i;
            }
        }
        System.out.println(count);
    }
}
