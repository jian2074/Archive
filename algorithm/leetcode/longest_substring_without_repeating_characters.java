class Solution {
    public int lengthOfLongestSubstring(String s) {
        int pointer_a = 0;
        int pointer_b = 0;
        int max = 0;
        HashSet<Character> hash = new HashSet();
        
        while (pointer_b < s.length()) {
            if (!hash.contains(s.charAt(pointer_b))) {
                hash.add(s.charAt(pointer_b));
                pointer_b++;
                max = Math.max(max, hash.size());
            } else {
                hash.remove(s.charAt(pointer_a));
                pointer_a++;
            }
        }
        return max;
        
    }
}