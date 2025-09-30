class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int map[]= new int[26];
        int map2[] = new int[26];

        List<Integer> ans = new ArrayList<>();
        if (s.length() < p.length()) return ans;

        for( int i = 0 ; i<p.length() ; i++){
            map[ s.charAt(i)-'a']++;
            map2[ p.charAt(i)-'a']++;
        }

        int i = 0;
        int j = p.length() ;

        

        while( j< s.length()){
            if( Arrays.equals( map , map2) ) ans.add(i);
            map[ s.charAt(i)-'a']--;
            map[ s.charAt(j)-'a']++;
             

            i++;
            j++;
        }
        if (Arrays.equals(map, map2)) ans.add(i);

        return ans ;
    }
}