package chap2;

import org.junit.Test;

public class Test5 {
    /**
     * 最大子序问题, 算法1
     * 穷举地尝试所有的可能  O(N的3次方)
     */

    public static int maxSubSum1(int[] a){
        int maxSum = 0;

        for (int i = 0; i < a.length; i++){
            for(int j = i; j < a.length; j++){
                int thisSum = 0;

                for(int k = i; k <=j; k++){
                    thisSum += a[k];
                }

                if(thisSum > maxSum){
                    maxSum = thisSum;
                }
            }
        }
        return  maxSum;
    }

    @Test
    public void test1(){
        int[] a = {1, -2, 3, 4, -5, 6};
        int maxSum = maxSubSum1(a);
        System.out.println("最大值:" + maxSum);
    }
}
