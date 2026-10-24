class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
<<<<<<< Updated upstream
        List<List<Integer>> result= new ArrayList<>();
=======
        List<List<Integer>> result=new ArrayList<>();
>>>>>>> Stashed changes
        Arrays.sort(nums);
        for(int i=0;i<nums.length - 2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
<<<<<<< Updated upstream
            int right=nums.length - 1;
            int target=-nums[i];
            while(left<right){
                int sum=nums[right] + nums[left];
                if(target==sum){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right && nums[left]==nums[left+1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }
                else if(target<sum){
                    right--;
                }
                else{
                    left++;
=======
            int end=nums.length-1;
            int target=-nums[i];
            while(left<end){
                int sum=nums[left]+nums[end];
                if(sum==target){
                    result.add(Arrays.asList(nums[i],nums[left],nums[end]));
                    while(left<end && nums[left]==nums[left+1]){
                        left++;
                    }
                    while(left<end && nums[end]==nums[end-1]){
                        end--;
                    }
                    left++;
                    end--;
                }
                else if(sum<target){
                    left++;
                }
                else{
                    end--;
>>>>>>> Stashed changes
                }
            }
        }
        return result;
    }
}