class Solution {
    public int subsetXORSum(int[] nums) {
        return subArray(nums,0,0);
    }
    static int subArray(int[] nums,int i,int curr){
        if(i==nums.length){
            return curr;
        }
        int withElement=subArray(nums,index+1,curr^nums[i]);
        int withoutElement=subArray(nums,index+1,curr);
        return withElement+withoutElement;
    }
}
