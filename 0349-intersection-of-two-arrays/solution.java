class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            set1.add(nums1[i]);
        }
    HashSet<Integer> set2 = new HashSet<>();
    int i=0;
    for(int j =0;j<nums2.length;j++)
    {
        if(set1.contains(nums2[j]))
        set2.add(nums2[j]);
        i++;
    } 
            int[] commonarr = new int[set2.size()];

        Iterator<Integer> it = set2.iterator();

int k=0;
    while(it.hasNext())
    {
        commonarr[k] = it.next();
        k++;
     }
     return commonarr;
    }
}  
