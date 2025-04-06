from collections import defaultdict

class Solution:
    def findSubstring(self, s, words):
        if not s or not words or len(words) == 0:
            return []
        
        # Length of each word and total length of the concatenated substring
        word_length = len(words[0])
        word_count = len(words)
        concat_length = word_length * word_count
        
        # Create a frequency map for the words
        word_map = defaultdict(int)
        for word in words:
            word_map[word] += 1
        
        result = []
        
        # Loop through the string considering each possible starting point
        for i in range(len(s) - concat_length + 1):
            seen_words = defaultdict(int)
            j = 0
            
            # Check each word-length segment in the substring
            while j < word_count:
                word_start_index = i + j * word_length
                word = s[word_start_index:word_start_index + word_length]
                
                # If word is not in the words list, break
                if word not in word_map:
                    break
                
                # Add the word to seen_words map
                seen_words[word] += 1
                
                # If seen word frequency exceeds its frequency in words array, break
                if seen_words[word] > word_map[word]:
                    break
                
                j += 1
            
            # If j reached word_count, all words match in this substring
            if j == word_count:
                result.append(i)
        
        return result


# Test the solution
solution = Solution()

s1 = "barfoothefoobarman"
words1 = ["foo", "bar"]
print("Output:", solution.findSubstring(s1, words1))  # Expected: [0, 9]

s2 = "wordgoodgoodgoodbestword"
words2 = ["word", "good", "best", "word"]
print("Output:", solution.findSubstring(s2, words2))  # Expected: []

s3 = "barfoofoobarthefoobarman"
words3 = ["bar", "foo", "the"]
print("Output:", solution.findSubstring(s3, words3))  # Expected: [6, 9, 12]
