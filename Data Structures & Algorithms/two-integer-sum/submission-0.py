class Solution:
   def twoSum(self,arr,x):
     for i in range(len(arr)):
        for j in range(i+1,len(arr)):
           if arr[i]+arr[j]==x:
             return [i,j]
     return []

arr=[3,4,5,6]
x=7
print(Solution().twoSum(arr,x))