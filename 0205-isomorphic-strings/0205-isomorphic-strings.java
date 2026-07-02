class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character , Character> sTot = new HashMap<>();
        Map<Character , Character> tTos = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
          char sc = s.charAt(i) ;
          char tc = t.charAt(i) ;

          if(sTot.containsKey(sc) && sTot.get(sc) != tc){
            return false ;
          }
          if(tTos.containsKey(tc) && tTos.get(tc) != sc){
            return false ;
          }
          
          sTot.put(sc , tc) ;
          tTos.put(tc , sc) ;
        }
        return true ;
    }
}