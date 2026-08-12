class Solution {
    public int[] rearrangeArray(int[] nums) {
    int posindex=0;
    int negindex=1;
    int arr[] = new int[nums.length];

    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]>0)
        {
        arr[posindex]=nums[i];
        posindex+=2;}
        else
        {
        arr[negindex]=nums[i];
        negindex+=2;
    }
    }        
    return arr;
    }
}

