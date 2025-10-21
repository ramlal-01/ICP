class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        ArrayDeque<Integer> res = new ArrayDeque<>();
        int n = asteroids.length;
        for( int i=0 ; i<n ; i++){
            if( asteroids[i]>0 ){
                res.push(asteroids[i]);
            }
            else{
                while( !res.isEmpty() && res.peek()>0 && res.peek()<Math.abs(asteroids[i]) ){
                    res.pop();
                }
                if(!res.isEmpty() && res.peek()==Math.abs(asteroids[i] )){
                    res.pop();
                }
                else if( res.isEmpty() || res.peek()<0){
                    res.push(asteroids[i]);
                }
            }
        }
        int[] arr = new int[res.size()];
        for (int i = res.size() - 1; i >= 0; i--) {
            arr[i] = res.pop();
        }
        return arr;
    }
}