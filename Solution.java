public class Solution {
    public static void main(String[] args) {
       // nums = [2,7,11,15], target = 9

        int [] nums = {3,2,3};
        int [] r =twoSum(nums,6);
        for (int x : r)
        {
            System.out.print(x+" ");
        }
    }


    public static int[] twoSum(int[] nums, int target) {
        int [] result= new int[2];

        for (int i=0; i< nums.length;i++)
        {
            for (int j = i + 1; j < nums.length ; j++)
            if (nums[i] + nums[j] == target)
            {
                result[0] = i;
                result [1] = j;
            }
        }


        return result;


    }
}
