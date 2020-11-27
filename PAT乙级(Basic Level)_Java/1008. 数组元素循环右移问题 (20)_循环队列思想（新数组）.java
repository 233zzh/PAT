package pat.Basic._1008;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: 张志浩 Zhang Zhihao
 * @Email: 3382885270@qq.com
 * @Date: 2020/11/27
 * @Time: 18:12
 * @Version: 1.0
 * @Description: Description
 */
public class ShiftRight4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        M = M % N; //M可能大于N
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            int input = sc.nextInt();
            arr[(i + M) % N] = input;
        }
        sc.close();

        for (int i = 0; i < N - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[N - 1]);
    }
}
