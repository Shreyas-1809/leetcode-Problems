class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.split(" ");

        for(int i=0;i<words.length;i++)
        {
            StringBuilder sb = new StringBuilder(words[i]);
            result.append(sb.reverse());
            result.append(" ");
        }
        return result.toString().trim();
}
}
