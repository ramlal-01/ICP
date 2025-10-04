class Solution {
    public int uniquePaths(int m, int n) {
        int vis[][] = new int[m][n];
        for( int ele[] : vis) Arrays.fill( ele , -1);

        return helper( 0 , 0 , m , n , vis);
    }

    public int helper( int row ,int col , int m , int n , int[][] vis){
        if (row >= m || col >= n) return 0;

        if( row == m-1 && col== n-1) return 1 ;

        if (vis[row][col] != -1) return vis[row][col];
         
        
        int a = helper( row , col+1 , m , n , vis);
            
        int b = helper( row+1 , col , m , n , vis );
        return vis[row][col] = a+b ;
    }
}