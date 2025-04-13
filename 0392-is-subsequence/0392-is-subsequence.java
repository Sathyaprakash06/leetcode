class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length(), n = t.length();
        int i = 0, j = 0;
        
        while (i < m && j < n) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; // Move pointer for `s` when characters match
            }
            j++; // Always move pointer for `t`
        }
        
        return i == m; // If `i` reaches `m`, all characters in `s` were found in order in `t`
    }
}
