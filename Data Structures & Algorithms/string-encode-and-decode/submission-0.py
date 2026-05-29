class Solution:
    def encode(self, strs: list[str]) -> str:
        encoded_string = ""
        for string in strs:
            for char in string:
                value = ord(char)
                encoded_string += chr(158 - value)
            encoded_string += "に"
        return encoded_string

    def decode(self, s: str) -> list[str]:
        decoded_list = []
        str = ""
        for char in s:
            if char == "に":
                decoded_list.append(str)
                str = ""
            else:
                str += chr(158 - ord(char))
        return decoded_list
