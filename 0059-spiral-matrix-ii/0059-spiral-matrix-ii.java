class Solution {
public int[][] generateMatrix(int n) {
    int[][] mat = new int[n][n];
    int top=0, bottom=n-1, left=0, right=n-1, num=1;
    while (top<=bottom && left<=right) {
        for (int c=left; c<=right; c++) mat[top][c]=num++;
        top++;
        for (int r=top; r<=bottom; r++) mat[r][right]=num++;
        right--;
        if (top<=bottom)
            for (int c=right; c>=left; c--) mat[bottom][c]=num++;
        bottom--;
        if (left<=right)
            for (int r=bottom; r>=top; r--) mat[r][left]=num++;
        left++;
    }
    return mat;
}
}