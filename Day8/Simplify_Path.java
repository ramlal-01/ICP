class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Deque<String> st = new ArrayDeque<>();

        for (String w : arr) {
            if (w.equals("") || w.equals(".")) continue;      
            else if (w.equals("..")) {
                if (!st.isEmpty()) st.pop();   
            } else {
                st.push(w);   
            }
        }
 
        StringBuilder sb = new StringBuilder();
        for (String dir : st) {
            sb.insert(0, "/" + dir); 
        }
 
        return sb.length() == 0 ? "/" : sb.toString();
    }
}
