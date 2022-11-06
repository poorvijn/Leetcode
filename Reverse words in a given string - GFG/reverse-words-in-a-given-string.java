//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        int n=S.length();
        int i=n-1;
        int j=n-1;
        String s=new String();
        String k= new String();
        while(i>=0)
        {
            while(j>0)
            {
                if(S.charAt(j-1)!='.')
                {
                    j--;
                }
                else
                {
                    break;
                }
            }
            if(j>=0)
            {
                k = S.substring(j,i+1); 
                s=s+k;
                if(j!=0)
                {
                    s+=".";
                }
                i=j-2;
                j=j-2;
            }
            else
            {
                break;
            }
           
        }
        return s;
    }
}