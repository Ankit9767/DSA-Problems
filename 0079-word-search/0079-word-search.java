class Solution {
boolean exist(char[][] board, String word) {
    for (int r=0; r<board.length; r++)
        for (int c=0; c<board[0].length; c++)
            if (dfs(board,word,r,c,0)) return true;
    return false;
}
boolean dfs(char[][] b, String w, int r, int c, int k) {
    if (k==w.length()) return true;
    if (r<0||r>=b.length||c<0||c>=b[0].length||b[r][c]!=w.charAt(k)) return false;
    char tmp=b[r][c];
    b[r][c]='#'; // mark visited
    boolean ok=dfs(b,w,r+1,c,k+1)||dfs(b,w,r-1,c,k+1)||dfs(b,w,r,c+1,k+1)||dfs(b,w,r,c-1,k+1);
    b[r][c]=tmp; // restore (backtrack)
    return ok;
}
}