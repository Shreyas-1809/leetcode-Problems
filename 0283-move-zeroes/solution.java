class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int newpos=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0){
            nums[newpos]=nums[i];
            newpos++;}
        }
        while(newpos<n)
        {
            nums[newpos]=0;
            newpos++;
        }

    }
    
}

        

