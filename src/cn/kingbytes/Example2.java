package cn.kingbytes;

/**
 * @author Freeman Hu
 * @date 2020/12/9
 * @email huchengye@sinopact.com
 * 百钱买百鸡，题目：公鸡3元一只，母鸡2元一只，小鸡1元钱3只，花100元钱买100只鸡，请问公鸡、母鸡、小鸡各买了多少只？
 */
public class Example2 {
    public static void main(String[] args) {
        for (int a = 0;a <= 33;a++) {
            int maxb = (100 - 3*a)/2;
            for (int b = 0;b <= maxb;b++) {
                int c = 100 - a - b;
                if (c % 3 != 0) continue;
                int m = a*3 + b*2 + c/3;
                if (m == 100) {
                    System.out.println(a + "  " + b + "  " + c);
                }
            }
        }
    }

}
