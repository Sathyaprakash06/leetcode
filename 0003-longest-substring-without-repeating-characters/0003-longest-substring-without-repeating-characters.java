 class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        Set<Character> seen = new HashSet<>();

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // If current character is already in the set, remove characters from start until it's not
            while (seen.contains(currentChar)) {
                seen.remove(s.charAt(start));
                start++;
            }

            // Add the current character to the set
            seen.add(currentChar);

            // Calculate the length of the current window and update maxLength if necessary
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abcabcbb";
        System.out.println("Length of longest substring without repeating characters: " + solution.lengthOfLongestSubstring(s));
    }
}


