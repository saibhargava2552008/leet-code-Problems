class Solution {
    public static double findMaxAverage(int[] nums, int k) {
        int windowsum=0;
        // sum of 1st window (size k)
        for(int i=0 ;i<k;i++){
            windowsum += nums[i];
        }
        int maxsum=windowsum;
        //slide the window 
        for(int i=k;i<nums.length;i++){
            windowsum+=nums[i]-nums[i-k];
            maxsum=Math.max(maxsum,windowsum);
        }
        return (double) maxsum/k;
    }
    public static void main(String[] args){
        int[] nums={1,12,-5,-6,50,3};
        int k=4;
        System.out.println("Maximun average: "+findMaxAverage(nums,k));
    }
}