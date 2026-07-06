class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() == t.length()) {
            int[] charCounts = new int[26];
            for(int i=0;i<s.length();i++){
             charCounts[s.charAt(i) - 'a']++;
             charCounts[t.charAt(i) - 'a']--;
            }

            for(int count: charCounts){
                if(count!=0)
                        return false;
            }
        }else{
            return false;
        }
        return true;
    }
}
