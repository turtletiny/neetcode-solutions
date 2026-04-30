class Solution:
    def nextGreaterElement(self, nums1: list[int], nums2: list[int]) -> list[int]:

        ans = []

        for i in nums1:
            index_of_i = None
            for j in range(len(nums2)):
                if nums2[j] == i:
                    index_of_i = j
                    break
            
            greater_element_found = False
            for k in nums2[index_of_i:]:

                if k > i:
                    ans.append(k)
                    greater_element_found = True
                    break
            if not greater_element_found:
                ans.append(-1)

        return ans