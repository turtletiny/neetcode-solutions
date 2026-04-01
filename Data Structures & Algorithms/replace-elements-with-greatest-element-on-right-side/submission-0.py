class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        for index, num in enumerate(arr[:-1]):
            rightside = arr[index+1:]
            sortedrightside = sorted(rightside)
            arr[index] = (sortedrightside[-1])
        arr[-1] = -1
        return(arr)

        