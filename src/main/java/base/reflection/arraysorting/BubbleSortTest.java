package base.reflection.arraysorting;

/**
 * Created by MaMingJiang on 2016/4/6.
 */
public class BubbleSortTest {
    /**
     * 原理：和紧挨的元素比较，如果小于，就交换，知道冒泡到最高 ,把某个元素一直浮到不能再浮为止
     * 从小到大
     */
    public static void main(String[] args) {
        int[] nums = new int[]{-4, 5, -2,7, 3, 9 ,1, 0};
        for(int i =0;i<nums.length;i++){
            for(int j = i;j<nums.length;j++){
                if(nums[i] > nums[j]){    // > 从小到大     <从大到小
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(int n : nums) {
            System.out.println(n);
        }
    }
}
