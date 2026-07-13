class Solution:
   def isAnagram(self,s,t):
    if len(s)!=len(t):
       return False
    t_list=list(t)
    for i in s:
      if i in t_list:
        t_list.remove(i)
      else:
        return False
    return True
s="racecar"
t="carrace"
print(Solution().isAnagram(s,t))
 