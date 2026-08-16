class Solution {
    public String removeOuterParentheses(String s)
    {
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        int cnt=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='(')
            {
                if(cnt>0)
                sb.append(ch[i]);

                cnt++;
            }
            else
            { cnt--;
            if(cnt>0)
            sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
    }

