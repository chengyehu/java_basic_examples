package cn.kingbytes.array;

import java.util.Scanner;

/**
 * @author Freeman Hu
 * @date 2020/12/18
 * @email huchengye@sinopact.com
 */
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[][] a = new int[n][];
        for (int i = 0;i < n;i++) {
            a[i] = new int[i+2];
            a[i][0] = 1;
            a[i][i+1] = 1;
        }



        for (int i = 0;i < n;i++) {
            for (int j = 0;j <= i;j++) {
                a[i][j] = a[i-1][j-1] + a[i-1][j];
            }
        }
    }
}
