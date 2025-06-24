class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            int d=words[i].length();
            if((words[i].charAt(0)=='a'||words[i].charAt(0)=='e'||words[i].charAt(0)=='i'||words[i].charAt(0)=='o'||words[i].charAt(0)=='u')&&(words[i].charAt(d-1)=='a'||words[i].charAt(d-1)=='e'||words[i].charAt(d-1)=='i'||words[i].charAt(d-1)=='o'||words[i].charAt(d-1)=='u'))
            count++;
        }
        return count;
    }
}