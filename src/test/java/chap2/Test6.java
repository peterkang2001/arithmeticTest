package chap2;

import org.junit.Test;

public class Test6 {
    /**
     * 最大子序问题, 算法2
     * 穷举地尝试所有的可能  O(N的平方)
     */

    public static int maxSubSum2(int[] a){
        int maxSum = 0;
        for (int i = 0; i < a.length; i++){
            int thisSum = 0;
            for (int j = i; j < a.length; j++){
                thisSum += a[j];
                // 将算法1的两次for循环合并成一次
                if(thisSum > maxSum){
                    maxSum = thisSum;
                }
            }
        }
        return maxSum;
    }


    @Test
    public void test1(){
        int[] a = {1, -2, 3, 4, -5, 6};
        int maxSum = maxSubSum2(a);
        System.out.println("最大值:" + maxSum);
    }
}
