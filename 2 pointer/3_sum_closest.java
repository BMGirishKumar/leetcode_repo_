class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest = nums[0] + nums[1] + nums[2]; 
        Arrays.sort(nums);
        for(int i=0;i<nums.length - 2;i++){
            int right=nums.length - 1;
            int left=i+1;
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                if (currentSum == target) {
                    return currentSum;
                }
                if (Math.abs(target - currentSum) < Math.abs(target - closest)) {
                    closest = currentSum;
                }
                if (currentSum > target) {
                    right--;
                } else {
                    left++;
                }
        }
        }
    return closest;
}
}