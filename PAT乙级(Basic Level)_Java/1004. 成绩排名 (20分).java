package pat.Basic._1004;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: 张志浩 Zhang Zhihao
 * @Email: 3382885270@qq.com
 * @Date: 2020/11/26
 * @Time: 19:06
 * @Version: 1.0
 * @Description: Description
 */
public class Rank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            String name = sc.next();
            String num = sc.next();
            System.out.println(name + " " + num);
            System.out.println(name + " " + num);
            return;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        String min_name = null;
        String max_name = null;
        String min_num = null;
        String max_num = null;
        while (n-- > 0) {
            String name = sc.next();
            String num = sc.next();
            int grade = sc.nextInt();
            if (grade < min) {
                min = grade;
                min_name = name;
                min_num = num;
            } else if (grade > max) {
                max = grade;
                max_name = name;
                max_num = num;
            }
        }
        sc.close();
        System.out.println(max_name + " " + max_num);
        System.out.println(min_name + " " + min_num);
    }
}
