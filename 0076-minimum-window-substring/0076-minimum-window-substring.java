class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> need = new HashMap<>() ;
        Map<Character, Integer> have = new HashMap<>() ;

        for(char c : t.toCharArray()){
            need.put(c , need.getOrDefault(c, 0) + 1) ;
        }

        int l = 0 ; 
        int bestLen = Integer.MAX_VALUE;
        int bestL = 0;
        int bestR = 0;
        int needed = need.size() ;
        int formed = 0 ;

        for(int r = 0 ; r < s.length() ; r++){
            char curr = s.charAt(r) ;
            have.put(curr , have.getOrDefault(curr, 0) + 1) ;

            if(need.containsKey(curr) && have.get(curr).equals(need.get(curr))){
                formed++ ;
            }

            while(formed == needed){
               if ((r - l + 1) < bestLen) {
                    bestLen = r - l + 1;
                    bestL = l;
                    bestR = r;
                }
                char left = s.charAt(l) ;
                have.put(left , have.get(left) -1) ;

                if(need.containsKey(left) && have.get(left) < need.get(left)){
                    formed-- ;
                }
                l++ ;
            }

        }
        return bestLen == Integer.MAX_VALUE ? "" : s.substring(bestL, bestR + 1);
    }
}