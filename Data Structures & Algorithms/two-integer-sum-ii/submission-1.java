class Solution {
    
    public static int[] twoSum(int[] nums, int target) {
        int[] a=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(i!=j && nums[i]+nums[j]==target){
                   a[0]=nums[i];
                   a[1]=nums[j];
                }

            }
        }
        for (int k=0;k<a.length;k++){
            System.out.println(a[k]);
        }
        return a;
    }
        public static void main(String[] args){
            twoSum(new int[]{1,2,3,4},3);
        }
    }


