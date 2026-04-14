class Solution:
    def stringMatching(self, words: List[str]) -> List[str]:
        substrings = []
        for word in words:
            for i in range(len(words)):
                if word in words[i] and word not in substrings and word != words[i]:
                    substrings.append(word)
        
        return substrings

        