class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int maxnum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
             if(nums[i]==maxnum)
            count++;
           else if(count==0)
            {
                maxnum=nums[i];
                count++;
            }
            else
            count--;
        }
        return maxnum;
    }
}
