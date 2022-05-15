class Solution {
    public int[] twoSum(int[] nums, int target) {
        // hashMap纪录已经访问过的数字
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
