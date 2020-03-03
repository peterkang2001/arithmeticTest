package chap2;

import org.junit.Test;

public class Test4 {
    /**
     * 最大子序问题, 算法3
     */

    public static int max3(int a, int b, int c){
        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        return max;
    }



//    private  static int maxSumRec(int[] a, int left, int right){
//
//    }
//
//
    /**
     * 测试max3
     */
    @Test
    public void testMax3_1(){
        int a = 1, b = 2, c = 3;
        int max = max3(a, b, c);
        System.out.println("最大值：" + max);

    }

    @Test
    public void testMax3_2(){
        int a = 9, b = 5, c = 3;
        int max = max3(a, b, c);
        System.out.println("最大值：" + max);

    }

}
