class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int n:nums){
            int digit = String.valueOf(n).length();
            if(digit % 2==0){
                count++;
            }
        }
        return count;
    }
}