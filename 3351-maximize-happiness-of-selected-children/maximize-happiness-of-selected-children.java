class Solution {
    public long maximumHappinessSum(int[] h, int k) {
        Arrays.sort(h);
        long sum=0;
        int x=0;
        long t=0;
        int i=h.length-1;
      while(x<k){
          long val = h[i] - t;   
            if (val <= 0) break; 
            sum=sum+val;
           x++;
           i--;
           t++;
        }
        return sum;
    }
}