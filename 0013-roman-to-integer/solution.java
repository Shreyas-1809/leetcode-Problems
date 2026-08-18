class Solution {
    public int romanToInt(String s) {
        int num=0;
    //int value[]={1000,900,500,400,100,90,50,40,10,9,5,1};
    //char ch[]={'M','CM','D','CD','C','XC','L','XL','X','IX','V','IV','I'};
    for(int i=0;i<s.length();i++)
    {
        char c = s.charAt(i);
        if(c=='C')
        {
            if(i+1<s.length() && s.charAt(i+1)=='M')
            {num = num+900;
            i=i+1;}
            else if(i+1<s.length() && s.charAt(i+1)=='D')
            {i=i+1;
                num = num+400;}
            else
            num = num+100;
        }
        else if(c=='I')
        {
            if(i+1<s.length() && s.charAt(i+1)=='V')
            { num = num+4;
            i=i+1;}
            else if(i+1<s.length() && s.charAt(i+1)=='X')
            {num = num+9;
            i=i+1;}
            else
            num = num+1;
        }
        else if(c=='X')
        {
            if(i+1<s.length() && s.charAt(i+1)=='L')
            {num = num+40;
            i=i+1;}
            else if(i+1<s.length() && s.charAt(i+1)=='C')
            {num = num+90;
            i=i+1;}
            else
            num = num+10;
        }
        else if(c=='V')
        num=num+5;
        else if(c=='M')
        num=num+1000;
        else if(c=='D')
        num=num+500;
        else
        num=num+50;
    }

    return num;
    } 
}
