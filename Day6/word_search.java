class Solution {
    public boolean dfs( char[][] board , String word , boolean visited[][] , char curr , int row , int col , int ind, StringBuilder sb){

        if( ind== word.length()-1) return true ; 
        visited[row][col] = true ; 

        int delrow[] = {-1,0,1,0};
        int delcol[] = {0,1,0,-1};

        for( int i = 0 ; i<4 ; i++){
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];

            if( nrow< board.length && ncol< board[0].length && nrow>=0 && ncol>=0 && !visited[nrow][ncol]  && board[nrow][ncol] == word.charAt(ind+1 ) ){
                if(dfs( board , word , visited , board[nrow][ncol] , nrow , ncol , ind+1 ,sb)) return true;
            }
        }
        visited[row][col] = false;
        
        return false ;
    }
    public boolean exist(char[][] board, String word) {
        char s = word.charAt(0);
        int m = board.length;
        int n = board[0].length;

        boolean visited[][] = new boolean[m][n];
        
        for( int i =0 ; i< m ; i++){
            for( int j = 0 ; j< n ; j++ ){
                StringBuilder sb = new StringBuilder();
                if( board[i][j]==s ){
                    if(dfs( board , word , visited , board[i][j] , i , j ,0 , sb )) return true;
                }
            }
        }
        return false ;
    }
}