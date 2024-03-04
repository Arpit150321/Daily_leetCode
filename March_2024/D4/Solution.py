class Solution(object):
    def bagOfTokensScore(self, tokens, power):
        """
        :type tokens: List[int]
        :type power: int
        :rtype: int
        """
        tokens.sort()
        score = 0
        maxScore = 0
        left = 0
        right = len(tokens) - 1
        while right >= left:
            if tokens[left] <= power:
                power = power - tokens[left]
                left += 1
                score += 1
            elif score >= 1:
                power = power + tokens[right]
                right -= 1
                score -= 1
            else:
                break
            maxScore = max(maxScore, score)

        return maxScore