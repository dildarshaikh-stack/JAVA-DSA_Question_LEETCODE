class Solution {
    public int majorityElement(int[] nums) {
        int max=0;
        int count=0;
        int element=nums[0];
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                    
                }
            }
            max=Math.max(max,count);
            if(max<=count){
                element=nums[i];
            }
        }
        return element;
    }
}