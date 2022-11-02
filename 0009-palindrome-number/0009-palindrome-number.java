class Solution {
    public boolean isPalindrome(int x) {  
        int y;
        int rem,sum=0;
        if(x<0)
        {
            return false;
        }
        else
        {
            y=x;
            while(y!=0)
            {
                rem=y%10;
                sum=sum*10+rem;
                y=y/10;
            }
            
            if(sum==x)
            {
                return true;
            }
            return false;
        }
        
    }
}