class Solution(object):
    def minimumLength(self, s):
        """
        :type s: str
        :retype: int
        """
        left = 0
        right = len(s) - 1
        while left < right and s[left] == s[right]:
            temp = s[left]
            while left < len(s) and s[left] == temp:
                left += 1
            while right > -1 and s[right] == temp:
                right -= 1
            if right < left:
                return 0
        return right - left + 1