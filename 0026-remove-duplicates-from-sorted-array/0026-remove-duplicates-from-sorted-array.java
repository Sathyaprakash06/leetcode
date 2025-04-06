public class Solution {
    public int removeDuplicates(int[] nums) {
        // If the array is empty or has only one element, there are no duplicates
        if (nums.length == 0) {
            return 0;
        }
        
        // Initialize a pointer for the position of the last unique element
        int k = 1; // Start from index 1 since the first element is always unique
        
        for (int i = 1; i < nums.length; i++) {
            // If the current element is not equal to the previous unique element
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]; // Set the unique element at the position k
                k++; // Move the pointer for the next unique element
            }
        }
        
        return k; // The number of unique elements
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {1, 1, 2};
        int k1 = solution.removeDuplicates(nums1);
        System.out.println("k = " + k1 + ", nums = " + java.util.Arrays.toString(nums1));

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = solution.removeDuplicates(nums2);
        System.out.println("k = " + k2 + ", nums = " + java.util.Arrays.toString(nums2));
    }
}
