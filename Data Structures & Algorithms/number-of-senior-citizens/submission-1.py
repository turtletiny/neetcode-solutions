class Solution:
    def countSeniors(self, details: List[str]) -> int:
        count = 0
        for i in details:
            if int(i[11]) > 6:
                count += 1
            elif int(i[11]) == 6:
                if int(i[12]) == 0:
                    pass
                else:
                    count += 1
        return count 
