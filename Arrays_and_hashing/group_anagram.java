class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> ans=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] chara=strs[i].toCharArray();
            Arrays.sort(chara);
            String f=new String(chara);
            if(!ans.containsKey(f)){
                ans.put(f,new ArrayList<>());
            }
            ans.get(f).add(strs[i]);
        }
        return new ArrayList<>(ans.values());
    }
}