class Solution:
    def numUniqueEmails(self, emails: list[str]) -> int:
        emails_list = []
        ans = len(emails)

        for i in emails:
            emails_list.append(i.split("@"))

        for i in emails_list:
            i[0] = i[0].replace(".", "")
        
        for i in emails_list:
            if "+" in i[0]:
                i[0] = i[0].split("+")
                i[0] = i[0][0]

        comparison = []
        for i in emails_list:
            if i in comparison:
                ans -=1
            comparison.append(i)
            

        return ans


solution = Solution()
print(solution.numUniqueEmails(["a@neetcode.com","b@neetcode.com","c@neetcode.com"]))