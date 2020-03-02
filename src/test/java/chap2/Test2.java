package chap2;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
    private static final int NOT_FOUND = -1;
    /**
     *  折半查找法，前提必须是有序数列
     */
    Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9 , 10};
    Integer[] arr2 = {-1, -2, -3, -4, -5, -6, -7, -8, -9 , -10};
    Integer[] arr3 = { -5, -6,-3, -4,  -7, -1, -2,-8, -9 , -10};

    @Test
    public void testBinarySearch3(){
        // 无序队列，应该不支持，只有将队列排好序之后
        Arrays.sort(arr3);
        for (Integer item:arr3) {
            System.out.print(item + " ");
        }
        System.out.println();

        int result = binarySearch(arr3, -5);
        if (result != -1) {
            System.out.println("查询到数据，位置在：:" + String.valueOf(result + 1));
        }else {
            System.out.println("没有查询到数据：" + String.valueOf(result));
        }
    }

    @Test
    public void testBinarySearch1(){
        // 有序队列正
        int result = binarySearch(arr1, 10);
        if (result != -1) {
            System.out.println("查询到数据，位置在：:" + String.valueOf(result + 1));
        }else {
            System.out.println("没有查询到数据：" + String.valueOf(result));
        }
    }

    @Test
    public void testBinarySearch2(){
        // 有序队列负
        int result = binarySearch(arr2, -2);
        if (result != -1) {
            System.out.println("查询到数据，位置在：:" + String.valueOf(result + 1));
        }else {
            System.out.println("没有查询到数据：" + String.valueOf(result));
        }
    }



    public static <AnyType extends Comparable<? super AnyType>>
        int binarySearch(AnyType[] a, AnyType x){

        int low = 0, high = a.length -1;

        while(low <= high){
            int mid = (low + high) /2;

            if(a[mid].compareTo(x) <0){
                low = mid + 1;
            }else if ( a[mid].compareTo(x ) > 0){
                high = mid - 1;
            }else {
                return mid;
            }
        }
        return NOT_FOUND;
    }
}
