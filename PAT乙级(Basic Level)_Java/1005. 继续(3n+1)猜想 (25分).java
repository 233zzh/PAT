package pat.Basic._1005;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: 张志浩 Zhang Zhihao
 * @Email: 3382885270@qq.com
 * @Date: 2020/11/26
 * @Time: 19:57
 * @Version: 1.0
 * @Description: Description
 */
public class 继续3n加1猜想 {
    private static HashSet<Integer> set = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int[] arr = new int[K];
        for (int i = 0; i < K; i++) {
            int n = sc.nextInt();
            arr[i] = n;
            if (!set.contains(n)) {
                process(n);
            }
        }
        sc.close();
        Arrays.sort(arr);
        int count = K - 1;
        for (int i = K - 1; i >= 0; i--) {
            if (!set.contains(arr[i])) {
                arr[count--] = arr[i];
            }
        }
        for (int i = K - 1; i > count + 1; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[count + 1]);
    }

    private static void process(int n) {
        if (n == 1) {
            return;
        }
        if (n % 2 == 0 && !set.contains(n / 2)) {//如果它是偶数，那么把它砍掉一半；
            set.add(n / 2);
            process(n / 2);
        } else if (n % 2 == 1 && !set.contains((3 * n + 1) / 2)) { //如果它是奇数，那么把 (3n+1) 砍掉一半
            set.add((3 * n + 1) / 2);
            process((3 * n + 1) / 2);
        }
    }
}
