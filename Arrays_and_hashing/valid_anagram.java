class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){return false;}
        char[] cha1=s.toCharArray();
        char[] cha2=t.toCharArray();
        Arrays.sort(cha1);
        Arrays.sort(cha2);
        int r=0;
        for(int i=0;i<cha1.length;i++){
            if(cha1[i]==cha2[i]){
                r++;
            }
        }
        return r==s.length();
    }
}