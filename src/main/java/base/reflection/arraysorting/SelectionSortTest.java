package base.reflection.arraysorting;

/**
 * Created by MaMingJiang on 2016/4/6.
 */
public class SelectionSortTest {

    public static void main(String[] args) {
        /**
         * 原理:遍历数组,取出最大的值与第一个数组元素交换 ,遍历数组,取出次大的值和第二个数组元素交换
         */
        int[] nums = new int[]{1,7,2,6,9,4,3,-1,8,7};
        for(int i = 0 ;i< nums.length;i++){
            //maxValue保存最大值，maxValueNum保存最大值的元素序号;默认取第一个元素为最大值
            int maxValue = nums[i];
            int maxValueNum = i;
            //当前元素只和下一个元素开始比,最后一个元素j = nums.length 不进入循环,因此不会数组越界
                for(int j = i+1;j< nums.length; j++){
                    if(nums[j] > maxValue){      //  > 从大到小    < 从小到达
                       maxValue = nums[j] ;
                       maxValueNum = j;
                }
            }
          //如果maxValue发生了变化,进行数组交换
          if(maxValue != nums[i]) {
              int temp = nums[i];
              nums[i] = nums[maxValueNum];
              nums[maxValueNum] = temp;
          }
        }
        for(int n : nums) {
            System.out.println(n);
        }
        //jdk Arrays自带的排序功能
//        Arrays.sort(nums);
//        System.out.println("**************");
//        for(int n : nums) {
//            System.out.println(n);
//        }
    }
}
