class Solution {
    static boolean hasDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
                
                }
                
            }
            return false;
    }
    public static void main(String[] args){
       boolean result= hasDuplicate(new int[]{1,2,3,4});
       System.out.println(result);
    }
        }
    
