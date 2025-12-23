class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
       ArrayList<Integer> list=new ArrayList<>();
       for(int i=0;i<n;i++){
        list.add(nums1[i]);
       }
        for(int i=0;i<m;i++){
        list.add(nums2[i]);
       }
       Collections.sort(list);
       int s=0;
       int e=list.size()-1;
      
        int mid=s+(e-s)/2;
        if(list.size()%2==0){
              return (list.get(mid)+list.get(mid+1))/2.0;
        }
            return list.get(mid);
   
    }
}