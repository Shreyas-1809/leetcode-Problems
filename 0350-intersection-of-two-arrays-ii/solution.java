class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] arr=new int[Math.min(nums1.length , nums2.length)];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int left=0,right =0;
        int j=0;
        while(left<nums1.length && right<nums2.length)
        {
            if(nums1[left]==nums2[right])
            {
                arr[j]=nums1[left];
                left++;
                right++;
                j++;
            }
            else if(nums1[left]<nums2[right])
                left++;
            else 
                right++;
                    }
        /*int[] union = new int[arr.size()];
        for(int i=0;i<arr.size();i++)
        {
            union[i]=arr.get(i);
        }*/
        return Arrays.copyOf(arr,j);
    }
}
