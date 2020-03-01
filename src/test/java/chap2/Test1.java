package chap2;

import org.junit.Test;

public class Test1 {
    /**
     * 最大公因子的欧几里得算法
     */
    @Test
    public void testGCD1(){
        // m 大于 n的情况
        System.out.println(gcd(50, 15));
    }

    @Test
    public void testGCD2(){
        // m 小于 n的情况
        System.out.println(gcd(15, 50));
    }

    public static long gcd(long m, long n){
        if (m < n){
            long temp = m;
            m = n;
            n = temp;
        }
        while( n != 0){          // 第1次          第2次
            long rem = m % n;   // 余5             余0
            m = n;              // m = 15          m=5
            n = rem ;           // n = 5           n = 0
        }
        return m;

    }

}
