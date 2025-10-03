class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
Arrays.sort(candidates); 
        func( 0 , candidates , target , res , new ArrayList<>() ) ;

        return res ;
    }

    public void func( int st , int[] candidates , int target , List<List<Integer>> res , List<Integer> path ){ 

        if( target==0 ){
            res.add( new ArrayList<>(path) );
            return ;
        }

        for( int i = st ; i<candidates.length; i++ ){
            if (i > st && candidates[i] == candidates[i - 1]) continue;
            if (candidates[i] > target) break;
            path.add( candidates[i] );
            func( i+1 , candidates ,  target-candidates[i] , res , path );
            path.remove( path.size()-1);
        }
    }
}



 
    
