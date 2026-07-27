class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i=0;
        int n = bits.length-1;
        while(i<n)
        {
            if(bits[i]==1)
            i+=2;
            else
            i=i+1;
        }
        
        if(i==n)
        return true;
        else 
        return false;
    }

}
    
    
