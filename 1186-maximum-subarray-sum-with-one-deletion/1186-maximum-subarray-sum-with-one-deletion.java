class Solution {
    public int maximumSum(int[] arr) {
        int keep = arr[0];
        int delete=0;
        int max = arr[0];
        for(int i = 1 ; i < arr.length; i++){
            delete = Math.max(keep , delete + arr[i]);
            keep = Math.max(arr[i] , keep + arr[i]);
            max = Math.max(max,Math.max(keep,delete));
        }
        return max;
    }
}