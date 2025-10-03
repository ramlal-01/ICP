class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();

        func( 1 , n , k , res , new ArrayList<>() ) ;

        return res ;
    }

    public void func( int st , int n , int k , List<List<Integer>> res , List<Integer> path ){

        if( path.size() ==k ){
            res.add( new ArrayList<>(path) );
            return ;
        }

        for( int i = st ; i<=n ; i++ ){
            path.add( i );
            func( i+1 , n , k , res , path );
            path.remove( path.size()-1);
        }
    }
}