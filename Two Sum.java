Java Language :

class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> hm = new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int num1=target-nums[i];
        if(hm.containsKey(num1)){
            return new int[]{hm.get(num1),i};
        }
        hm.put(nums[i],i);
       }
       return new int[]{};
    }
}
