class Solution {
    public String frequencySort(String s) {
    Map<Character, Integer> map = new HashMap<>();

    // Step 1: Count frequencies
    for (char c : s.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }

    // Step 2: Create a list of characters from the map keys
    List<Character> chars = new ArrayList<>(map.keySet());

    // Step 3: Sort characters by frequency in descending order
    chars.sort((a, b) -> map.get(b) - map.get(a));

    // Step 4: Build the result string
    StringBuilder res = new StringBuilder();
    for (char c : chars) {
        int freq = map.get(c);
        for (int i = 0; i < freq; i++) {
            res.append(c);
        }
    }

    return res.toString();

    }
}