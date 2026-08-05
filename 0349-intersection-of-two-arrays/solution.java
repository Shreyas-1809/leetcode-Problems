class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1= new HashSet<>();
        int left=0;
        while(left<nums1.length)
        {
            set1.add(nums1[left]);
            left++;
        }
        int right=0;
        HashSet<Integer> set2=new HashSet<>();
        while(right<nums2.length)
        {
            if(set1.contains(nums2[right]))
                set2.add(nums2[right]);
                right++;
        }
        int n= set2.size();
        int[] arr = new int[n];
        Iterator<Integer> it = set2.iterator();
        int i=0;
        while(it.hasNext())
        {
            arr[i]=it.next();
            i++;
        }
           return arr;
    }
}

          
            

