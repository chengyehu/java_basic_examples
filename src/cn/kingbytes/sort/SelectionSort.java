package cn.kingbytes.sort;

/**
 * @author Freeman Hu
 * @date 2020/12/28
 * @email huchengye@sinopact.com
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {8, 5, 4, 3, 7, 2};
        // 选择排序法，一个元素与其他所有元素比较
        /**
         *      0   1   2   3   4   5
         *      8   5   4   3   7   2
         *
         * 0-1  5   8   4   3   7   2
         * 0-2  4   8   5   3   7   2
         * 0-3  3   8   5   4   7   2
         * 0-4  3   8   5   4   7   2
         * 0-5  2   8   5   4   7   3
         *
         * 1-2  2   5   8   4   7   3
         * 1-3  2   4   8   5   7   3
         * 1-4  2   4   8   5   7   3
         * 1-5  2   3   8   5   7   4
         *
         * 2-3  2   3   5   8   7   4
         * 2-4  2   3   5   8   7   4
         * 2-5  2   3   4   8   7   5
         *
         * 3-4  2   3   4   7   8   5
         * 3-5  2   3   4   5   8   7
         *
         * 4-5  2   3   4   5   7   8
         */

        for (int i = 0;i< a.length - 1;i++) {
            for (int j = i + 1;j < a.length;j++){
                // 比较a[i]和a[j]
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }

        for (int j : a) {
            System.out.print(j + "\t");
        }
    }
}
