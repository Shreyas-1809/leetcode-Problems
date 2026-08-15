class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int maxnum1=Integer.MIN_VALUE;
        int count1=0;

        int maxnum2=Integer.MAX_VALUE;
        int count2=0;

        for(int i=0;i<nums.length;i++)
        {

            if(maxnum1==nums[i])
            {
                count1++;
            }

            else if(maxnum2==nums[i])
            {
                count2++;
            }
            else if(count1==0){
                maxnum1=nums[i];
            count1++;}
            else if(count2==0){
            count2++;
            maxnum2=nums[i];}
            else{
            count2--;
            count1--;}
        }
        int n1=0;
        int n2=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==maxnum1)
            n1++;
            else if(nums[i]==maxnum2)
            n2++;
        }
        ArrayList<Integer> list  = new ArrayList<>();
        if(n1>(nums.length/3))
        list.add(maxnum1);
        if(n2>(nums.length)/3)
        list.add(maxnum2);

        return list;         
    }
}
