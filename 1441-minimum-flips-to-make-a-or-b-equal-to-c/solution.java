class Solution {
    public int minFlips(int a, int b, int c) {
        
        int flip=0;
        
        while(a!=0 ||b!=0||c!=0)
        {
        int num1 = a&1;
        int num2 = b&1;
        int num3 = c&1;
            if(num3==1)
            {
                if(num2==0 && num1==0)
                flip++;
            }
            if(num3==0)
            {
                if(num1==1 && num2==1)
                flip+=2;
                else if(num1==1 || num2==1)
                flip++;
            }
            
            a=a>>1;
            b=b>>1;
            c=c>>1;
        
        }
        return flip;
    }
}
