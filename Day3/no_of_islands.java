 class Solution {
    public void dfs( int ro , int co , int[][]visited , char[][] grid){
        visited[ro][co] = 1;  
        int m = grid.length ;
        int n = grid[0].length ;
        int[] drow = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};

        for (int k = 0; k < 4; k++) {
            int nrow = ro + drow[k];
            int ncol = co + dcol[k];
            if (nrow >= 0 && nrow < m && ncol >= 0 && ncol < n
                && grid[nrow][ncol] == '1' && visited[nrow][ncol] == 0) { 
                    dfs( nrow , ncol , visited , grid );
            }
        }
    }

    public int numIslands(char[][] grid) {
        int m = grid.length ;
        int n = grid[0].length ;
        int visited[][] = new int[m][n];
        int c=0;
        for( int i=0 ; i<m ; i++){
            for ( int j=  0 ; j< n ; j++){
                if( visited[i][j]==0 && grid[i][j]=='1'){
                    c++;
                    dfs( i , j , visited , grid );
                }
            }
        }
        return c;
    }
}