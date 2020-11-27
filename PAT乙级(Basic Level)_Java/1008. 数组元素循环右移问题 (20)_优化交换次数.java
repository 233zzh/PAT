package pat.Basic._1008;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: 张志浩 Zhang Zhihao
 * @Email: 3382885270@qq.com
 * @Date: 2020/11/27
 * @Time: 15:03
 * @Version: 1.0
 * @Description: Description
 */
public class ShiftRight2 {
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
        if (N % 2 == 0) {
            int flag;
            flag = M <= N / 2 ? M : N - M;
            for (int i = 0; i < flag; i++) {
                int temp = arr[i];
                int index = i;
                /*for (int k = 0; k < N / M; k++) {
                    index = (index + M) % N;
                    int temp1 = arr[index];
                    arr[index] = temp;
                    temp = temp1;
                }*/
                while (true) {
                    index = (index + M) % N;
                    int temp1 = arr[index];
                    if (temp1 == temp) {
                        break;
                    }
                    arr[index] = temp;
                    temp = temp1;
                }
            }
        } else {
            int temp = arr[0];
            int index = 0;
            for (int k = 0; k < N; k++) {
                index = (index + M) % N;
                int temp1 = arr[index];
                arr[index] = temp;
                temp = temp1;
            }
        }
        for (int i = 0; i < N - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[N - 1]);
    }
}
