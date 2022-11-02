class Solution {
    public int romanToInt(String s) {
        int sum=0;
        if(s.length()>15)
        {
            return -1;
        }
        for(int i=0;i<s.length();i++)
        {
            if(i<s.length()-1)
            {
                if(s.charAt(i)=='I'&&(s.charAt(i+1)=='V'||s.charAt(i+1)=='X'))
                {
                    sum=sum+romanToInt(s.charAt(i+1))-romanToInt(s.charAt(i));
                    ++i;
                }
                else if(s.charAt(i)=='X'&&(s.charAt(i+1)=='L'||s.charAt(i+1)=='C'))
                {
                    sum=sum+romanToInt(s.charAt(i+1))-romanToInt(s.charAt(i));
                    ++i;
                }
                else if(s.charAt(i)=='C'&&(s.charAt(i+1)=='D'||s.charAt(i+1)=='M'))
                {
                    sum=sum+romanToInt(s.charAt(i+1))-romanToInt(s.charAt(i));
                    ++i;
                }
                else
                {
                    sum=sum+romanToInt(s.charAt(i));
                }
            }
            else
                    sum+=romanToInt(s.charAt(i));
        }
        return sum;
    }
    
    static int romanToInt(char c)
    {
        switch(c)
        {
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
        }
        return 0;
    }
}