class Solution:
    def topKFrequent(self, arr,x):
        counts = collections.Counter(arr)
        common = counts.most_common(x)
        a = [item[0] for item in common]
        return a
arr=[1,2,2,3,3,3]
x=2
print(Solution().topKFrequent(arr,x))