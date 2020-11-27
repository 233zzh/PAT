package pat.Basic._1008;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: 张志浩 Zhang Zhihao
 * @Email: 3382885270@qq.com
 * @Date: 2020/11/27
 * @Time: 17:58
 * @Version: 1.0
 * @Description: Description
 */
public class ShiftRight3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        M = M % N; //M可能大于N
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            int input = sc.nextInt();
            arr[i] = input;
        }
        sc.close();

        reverse(arr, 0, N - M - 1);
        reverse(arr, N - M, N - 1);
        reverse(arr, 0, N - 1);

        for (int i = 0; i < N - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[N - 1]);
    }

    private static void reverse(int[] arr, int start, int end) {
        for (int i = start; i <= (start + end) / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[end + start - i];
            arr[end + start - i] = temp;
        }
    }
}
