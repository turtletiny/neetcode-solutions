class Solution:
    def topKFrequent(self, nums: list[int], k: int) -> list[int]:
        count = {}
        for num in nums:
            count[num] = 1 + count.get(num, 0)

        arr = []
        for key, value in count.items():
            arr.append([value, key])
            arr.sort(reverse=True)

        res = []
        for i in range(k):
            res.append(arr[i][1])

        return res
