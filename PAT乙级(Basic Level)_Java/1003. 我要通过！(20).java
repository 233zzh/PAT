package pat.Basic._1003;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: 张志浩 Zhang Zhihao
 * @Email: 3382885270@qq.com
 * @Date: 2020/11/26
 * @Time: 11:54
 * @Version: 1.0
 * @Description: Description
 */
public class Ddopt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String input = sc.next();
            if (judge(input)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    //本题必须满足的条件如下：
    // 1.字符串中必须仅有 P、 A、 T这三种字符，不可以包含其它字符；
    // 2.P和T之间不能没有A(A的个数大于等于1，等于0就是错的)
    // 3.开头(P之前)的A的个数 * 中间（P和T中间）的A的个数 = 结尾（T之后）的A的个数，
    // 4.P和T只能有一个（可以合并到条件4，判断了条件4就不要判断这个了，看了条件4的计算公式就全明白了
    //      比如PPATT，P_index*(T_index - P_index - 1) == str.length() - T_index - 1）
    //      0*（）==5-3-1
    private static boolean judge(String str) {
        String newStr = str.replace("P", "").replace("A", "").replace("T", "");
        if (newStr.isEmpty()) {//判断条件1
            int P_index = str.indexOf('P');
            int T_index = str.indexOf('T');
            if (P_index == T_index - 1) {//判断条件2
                return false;
            }
            /*if((str.indexOf('P')==str.lastIndexOf('P'))||(str.indexOf('T')==str.lastIndexOf('T'))){//判断条件4
                return false;
            }*/
            return P_index * (T_index - P_index - 1) == str.length() - T_index - 1; //判断条件3
        }
        return false;
    }
}
