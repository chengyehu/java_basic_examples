package cn.kingbytes.sort;

import java.util.Arrays;

/**
 * @author Freeman Hu
 * @date 2020/12/28
 * @email huchengye@sinopact.com
 */
public class JDKSort {
    public static void main(String[] args) {
        int[] a = {8, 5, 4, 3, 7, 2};
        Arrays.sort(a);
        for (int j : a) {
            System.out.print(j + "\t");
        }
    }
}
