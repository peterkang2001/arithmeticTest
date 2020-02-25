import org.junit.Test;

public class Test1 {
    @Test
    public void test1(){
        /**
         * 递归算法 用取模的方式
         */
        int a = 762348889;
        Long startTime = System.currentTimeMillis();
        printOut(a);
        Long endTime = System.currentTimeMillis();
        System.out.println("总共花费了 : " + (endTime - startTime));

    }

    public static void printOut(int n ){

        if(n >= 10){
            System.out.println("这轮 n= " + n);
            printOut( n  / 10);
        }
        System.out.println( n % 10);
    }

    @Test
    public void test2(){
        /**
         * 递归算法 优化了取模运算，用来缩短取模时间
         */
        int a = 762348889;
        Long startTime = System.currentTimeMillis();
        printOut2(a);
        Long endTime = System.currentTimeMillis();
        System.out.println("总共花费了 : " + (endTime - startTime));

    }

    public static void printOut2(int n ){

        if(n >= 10){
            System.out.println("这轮 n= " + n);
            printOut( n  / 10);
        }
//        System.out.println( n % 10);
        System.out.println(n - n /10 * 10);
    }
}
