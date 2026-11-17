class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a=new int[2];
        int h=-1;
        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(h==-1){
                    h=i;
                    j=i;
                }
                else{
                    j++;
                }
            }
        }
        a[0]=h;
        a[1]=j;
        return a;
    }
}