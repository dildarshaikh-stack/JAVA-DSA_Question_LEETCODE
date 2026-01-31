class Solution {
    public int removeDuplicates(int[] nums) {
       ArrayList<Integer> list=new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i>0){
                if(list.size()!=0 && list.get(list.size() - 1)==nums[i]){
                    count++;
                }else{
                    count=0;
                }
            }
            if(count<2){
                list.add(nums[i]);
            }
        }
        
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return list.size();
    }
}