import java.util.*;
class Solution 
{
    public int thirdMax(int[] nums) 
    {
        Arrays.sort(nums);
        int[] result = new int[nums.length];
        int index = 0;  
        for(int i = 0; i < nums.length; i++) 
        {
            if (i == 0 || nums[i] != nums[i - 1]) 
            {
                result[index] = nums[i];
                index++;
            }
        }
        if (index < 3) 
        {
            return result[index - 1];  // Return maximum
        } 
        else 
        {
            return result[index - 3];  // Return 3rd distinct max
        }
    }
}