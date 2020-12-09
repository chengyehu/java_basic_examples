package cn.kingbytes;

import java.util.Scanner;

/**
 * @author Freeman Hu
 * @date 2020/12/9
 * @email huchengye@sinopact.com
 * 打印等腰三角形
 */
public class Example3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1;i <= n;i++) {
            // 先打印n-i个空格
            for (int j = 0;j < n - i;j++) {
                System.out.print(' ');
            }
            // 打印2*i-1个*
            for (int j = 0;j < 2*i -1;j++){
                System.out.print('*');
            }
            // 换行
            System.out.println();
        }
    }
}
