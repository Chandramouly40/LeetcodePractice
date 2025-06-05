class Anagram {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        int count = s.length();
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            if(freq[t.charAt(i)-'a']>0){
                freq[t.charAt(i)-'a']--;
                count--;
            }
            else{
                break;
            }
        }
        if(count==0){
            return true;
        }
        return false;
    }
}
