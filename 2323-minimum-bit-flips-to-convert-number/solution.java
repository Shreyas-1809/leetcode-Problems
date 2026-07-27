class Solution {
    public int minBitFlips(int start, int goal) {
        int num = start^goal;
        int cnt=0;
        while(num>1)
        {
            if(num%2==1)
            cnt++;
            num=num/2;
        }
        if(num==1)
        cnt++;
        return cnt;
    }
}
