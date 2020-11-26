package pat.Basic._1001;


/**
 * Created by IntelliJ IDEA.
 *
 * @Author: 张志浩  Zhang Zhihao
 * @Email: 3382885270@qq.com
 * @Date: 2020/4/29
 * @Time: 21:29
 * @Version: 1.0
 */

import java.util.Scanner;

public class 害死人不偿命的3n加1猜想 {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        process(n);
        System.out.println(count);
    }


    public static void process(int n) {
        if (n == 1) {
            return;
        }
        count++;
        if (n % 2 == 0) {//如果它是偶数，那么把它砍掉一半；
            process(n / 2);
        } else { //如果它是奇数，那么把 (3n+1) 砍掉一半
            process((3 * n + 1) / 2);
        }
    }
}
