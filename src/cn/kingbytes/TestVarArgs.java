package cn.kingbytes;

/**
 * @author Freeman Hu
 * @date 2020/12/11
 * @email huchengye@sinopact.com
 */
public class TestVarArgs {
    public static void main(String[] args){
        System.out.println(add(0,1,4,3,6));
    }

    public static int add(int... a){
        int result = 0;
        for (int i = 0;i < a.length;i++) {
            result += a[i];
        }
        return result;
    }

}
