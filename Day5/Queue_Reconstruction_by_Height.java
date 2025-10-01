class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort( people , (a,b) -> Integer.compare( a[0] , b[0]));

        int n = people.length ;
        
        int ans[][] = new int[n][2];
        
        for (int[] row : ans) Arrays.fill(row, -1);


        for( int i =0 ; i<n ; i++){
            int c =people[i][1];
            for( int j = 0 ; j<n ; j++){

                if( ans[j][0]==-1 && c ==0 ){
                    ans[j][0] =people[i][0];
                    ans[j][1]= people[i][1];
                    break;
                }
                else if( ans[j][0]==-1 || ans[j][0]>= people[i][0]){
                    c--;
                }
            }
        }
        return ans;
    }
}