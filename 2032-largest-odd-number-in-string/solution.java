class Solution {
    public String largestOddNumber(String num) {
        //char[] ch = num.toCharArray();
        String str="";
        for(int i=num.length()-1;i>=0;i--)
        {
            char ch = num.charAt(i);
            if(((int)ch%2)!=0){
            str=num.substring(0,i+1);
            break;
            }        
        }
        return str;
    }
}
