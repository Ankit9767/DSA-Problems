class Solution {
    public String longestPalindrome(String s) {
        String result = "";

        for(int i = 0 ; i < s.length() ; i++){
            String odd = expand(s, i, i);
            String even = expand(s, i, i+1);

            String longer = odd.length() > even.length() ? odd : even ;

            if(longer.length() > result.length()){
                result = longer ;
            }
        }
        return result ; 
    }

    public String expand(String s , int l , int r){
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l-- ;
            r++ ;
        }
        return s.substring(l+1, r);
    }
}