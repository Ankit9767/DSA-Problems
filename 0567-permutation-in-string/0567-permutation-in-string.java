class Solution {
    public boolean checkInclusion(String s1, String s2) {

        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> have = new HashMap<>();

        for (char c : s1.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int k = s1.length();
        int matches = 0;
        int needed = need.size();

        for (int r = 0; r < s2.length(); r++) {
            char rightChar = s2.charAt(r);
            have.put(rightChar, have.getOrDefault(rightChar, 0) + 1);
            if (need.containsKey(rightChar) &&
                have.get(rightChar).equals(need.get(rightChar))) {
                matches++;
            }

            if (r >= k) {
                char leftChar = s2.charAt(r - k);
                if (need.containsKey(leftChar) &&
                    have.get(leftChar).equals(need.get(leftChar))) {
                    matches--;
                }
                have.put(leftChar, have.get(leftChar) - 1);

                if (have.get(leftChar) == 0) {
                    have.remove(leftChar);
                }
            }

            if (matches == needed) {
                return true;
            }
        }

        return false;
    }
}