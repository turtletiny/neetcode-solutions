class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        final = []
        for j, jar in enumerate(s):
            print(f"index of s: {j}, characer in s: {jar}")

            for index, char in enumerate(t):
                if jar == char:
                    t = t[index+1:]
                    final.append(jar)
                    break
        if len(final) == len(s):
            return True
        else:
            return False
                                                        