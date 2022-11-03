class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++)
        {
            sum1+=nums[i];
        }
        int n=nums.length;
        sum2=(n*(n+1))/2;
        
        return sum2-sum1;

    }
}