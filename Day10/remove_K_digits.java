class Solution {
    public String removeKdigits(String num, int k) {
        ArrayDeque<Character> st = new ArrayDeque<>();
        int n = num.length();
        for( int i=0 ; i<n ; i++){
            while( !st.isEmpty() && k>0 && st.peek()-'0'>num.charAt(i)-'0'){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while( k>0){
            st.pop();
            k--;
        }

        if( st.isEmpty()) return "0";
        StringBuilder result = new StringBuilder();
        while( !st.isEmpty()){
            result.append(st.pop());
        }
        StringBuilder res = new StringBuilder();
        int index;
        for(index=result.length()-1;index>0;index--){
            if(result.charAt(index)!='0'){
                break;
            }
        }
        for(int i=index;i>=0;i--){
            res.append(result.charAt(i));
        }
        return res.toString();
    }
}