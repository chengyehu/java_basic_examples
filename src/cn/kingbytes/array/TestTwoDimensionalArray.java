package cn.kingbytes.array;

/**
 * @author Freeman Hu
 * @date 2020/12/17
 * @email huchengye@sinopact.com
 */
public class TestTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] a;
        //a = new int[4][3];
        a = new int[][]{{100,90,80},{100,95,90},{90,80,95},{100,97,92}};
        for (int i = 0;i < a.length;i++) {
            for (int j = 0;j < a[i].length;j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
