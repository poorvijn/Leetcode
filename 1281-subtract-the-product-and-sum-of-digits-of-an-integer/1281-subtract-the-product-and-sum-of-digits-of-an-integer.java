class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,prod=1,rem,i,result;
   
        //sum and product calculation
        while(n!=0)
        {
            rem=n%10;
            sum+=rem;
            prod=prod*rem;
            n=n/10;
        }
        
        //subtraction
        result=prod-sum;
        return result;
    }
}