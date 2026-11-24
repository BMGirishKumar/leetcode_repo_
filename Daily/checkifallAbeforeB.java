class Solution {
    public boolean checkString(String s) {
        int counter=0;
        for(int i=0;i<s.length();i++){
            if(counter>0 && s.charAt(i)=='a'){
                return false;
            }
            if(s.charAt(i)=='b'){
                counter++;
            }
        }
        return true;
    }
}