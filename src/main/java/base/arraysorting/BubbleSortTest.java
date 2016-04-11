package base.reflection.arraysorting;

/**
 * Created by MaMingJiang on 2016/4/6.
 */
public class BubbleSortTest {
    /**
     * 原理：和紧挨的元素比较，如果小于，就交换(如果不用交换，那右边的数是当前最大的)直到冒泡到最高 ,把某个元素一直浮到不能再浮为止
     * 从小到大
     */
    public static void main(String[] args) {
        int[] nums = new int[]{9,8,7,6,5,4,3};
        for(int i =0;i<nums.length;i++){
            //拿当前元素和之后的元素一次比较,如果大于其他元素,就交换位置
            for(int j = 0;j+1<nums.length;j++){
                if(nums[j] > nums[j+1]){    // > 从小到大     <从大到小
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for(int n : nums) {
            System.out.println(n);
        }
    }
}
