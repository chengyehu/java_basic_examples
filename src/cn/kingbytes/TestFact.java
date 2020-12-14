package cn.kingbytes;

/**
 * @author Freeman Hu
 * @date 2020/12/10
 * @email huchengye@sinopact.com
 */
public class TestFact {
    public static void main(String[] args){
        System.out.println(fact(8));
        System.out.println(fabo(18));
    }


    public static int fact(int n) {
        if (n == 1) return 1;
        int result = n * fact(n-1);
        return result;
    }

    public static int fabo(int n) {
        if (n == 1 || n == 2) return 1;
        else return fabo(n-1) + fabo(n-2);
    }

}
