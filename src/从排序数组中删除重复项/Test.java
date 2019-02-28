package 从排序数组中删除重复项;
/**
 * 从排序数组中删除重复项
 * date:2019/2/28
 * author:XuMingyang
 */

import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] nums = {-3,-1,0,0};   //  源数组
        int a = a(nums);
        for(int i = 0;i<a;i++){
            System.out.println(nums[i]);
        }
    }
    public static int a(int[] nums) {
        ArrayList a = new ArrayList();  //通过ArrayList的contains方面判断是否重复
        int j = 0;      //源数组指针
        /**
         *  date:2019/2/28
         *  author:ZhaoJinnan
         *  源数组由源数组指针位置开始，判断是否在ArrayList中存在。
         *  如果不存在则将该元素添加到ArryList中，且将该元素至于源数组指针的位置，然后指针移动。
         *  如果重复则直接跳过。直到结束。
         *  之后返回指针。
         */
        for(int i=0; i<nums.length; i++){
            if(!a.contains(nums[i])){
                a.add(nums[i]);
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
