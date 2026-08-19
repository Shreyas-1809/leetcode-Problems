class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        char[] ch1 =s.toCharArray();
        char[] ch2 = t.toCharArray();
        int count =0;

        Arrays.sort(ch1);
        Arrays.sort(ch2);  
        for(int i=0;i<s.length();i++)
        {
            if(ch1[i]==ch2[i])
            count++;
        }      
        if(count==s.length())
        return true;
        else
        return false;
    }
}
