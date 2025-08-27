 class Solution {
    public int lengthOfLongestSubstring(String s) {
Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0; // Start of sliding window

        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);

            // If character is already seen, move start pointer
            if (map.containsKey(ch)) {
                start = Math.max(start, map.get(ch) + 1);
            }

            // Update the latest index of the current character
            map.put(ch, end);

            // Update max length
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
        }
}


