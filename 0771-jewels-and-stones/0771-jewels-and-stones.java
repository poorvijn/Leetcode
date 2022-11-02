class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=1;i<stones.length();i++)
        {
            String s = stones.substring(i-1,i);
            if(jewels.contains(s))
                count++;
        }
        String last = stones.substring(stones.length()-1,stones.length());
        if(jewels.contains(last))
            count++;
        
        return count;
    }
}