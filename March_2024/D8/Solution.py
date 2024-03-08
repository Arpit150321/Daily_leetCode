class Solution(object):
    def maxFrequencyElements(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        frequency_dict = {}
        for i in nums:
            if i not in frequency_dict:
                frequency_dict[i] = 1
            else:
                frequency_dict[i] += 1
        MaxFrequency = max(frequency_dict.items(), key = operator.itemgetter(1))[1]
        count = 0
        for i in frequency_dict:
            if frequency_dict[i] == MaxFrequency:
                count += MaxFrequency
        return count