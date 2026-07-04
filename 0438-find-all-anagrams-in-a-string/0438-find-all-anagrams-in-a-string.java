class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> have = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for (char c : p.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int k = p.length();
        int matches = 0;
        int needed = need.size();

        for (int r = 0; r < s.length(); r++) {
            char rc = s.charAt(r);
            have.put(rc, have.getOrDefault(rc, 0) + 1);
            if (need.containsKey(rc) && have.get(rc).equals(need.get(rc))) {
                matches++;
            }
            if (r >= k) {
                char lc = s.charAt(r - k);
                if (need.containsKey(lc) && have.get(lc).equals(need.get(lc))) {
                    matches--;
                }
                have.put(lc, have.get(lc) - 1);
                if (have.get(lc) == 0) {
                    have.remove(lc);
                }
            }
            if (matches == needed) {
                res.add(r - k + 1);
            }
        }
        return res;
    }
}