class Solution {
    public boolean lemonadeChange(int[] bills) {
        int arr[] = new int[3] ;

        for ( int i = 0 ; i< bills.length ; i++){

            if( bills[i]==5){
                arr[0]++;
            }

            else if( bills[i]==10){
                arr[1]++;
                if( arr[0]<1) return false ;
                else arr[0]--;
            }

            else{
                arr[2]++;

                if( (arr[1]>=1 && arr[0]>=1) ){
                    arr[0]--;
                    arr[1]-- ;
                }
                else if ( arr[0]>=3 ){
                    arr[0] -= 3 ;
                }

                else return false ;
            }
        }
        return true ;
    }
}