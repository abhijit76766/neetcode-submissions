class Solution {
    public int climbStairs(int n) {
        int[] arr = new int[n+1];
        return solve(n,arr);
        
    }
    public int solve(int n,int[] arr){
        if(arr[n] != 0){
            return arr[n];
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        
        arr[n] = solve(n-1,arr) + solve(n-2,arr);
        return arr[n];

       
    }
}
