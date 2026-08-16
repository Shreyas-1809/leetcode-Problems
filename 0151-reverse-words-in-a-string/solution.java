class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for(int i=words.length-1;i>=0;i--)
        {
            if(words[i].equals(""))
            continue;
            else{
            sb.append(words[i]);
            sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}
