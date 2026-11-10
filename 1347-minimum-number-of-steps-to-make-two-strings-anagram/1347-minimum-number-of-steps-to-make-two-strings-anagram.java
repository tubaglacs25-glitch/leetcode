class Solution {
    public int minSteps(String s, String t) {
          int[] freq=new int[26];
          int count=0;
          for(int i=0;i<s.length();i++){
                 freq[s.charAt(i)-'a']++;
                 freq[t.charAt(i)-'a']--;
          }
          for(int i=0;i<26;i++){
             if(freq[i]>0)
             count+=freq[i];
          }
          return count;
    }
}    
        //int count = 0;
        //int ans;
        //boolean[] visited = new boolean[t.length()];
        //for (int i = 0; i < s.length(); i++) {
          //  for (int j = 0; j < t.length(); j++) {
            //    if (s.charAt(i) == t.charAt(j) && !visited[j]) {
              //      count++;
                //    visited[j] = true;
                  //  break;
                //}

           // }
        //}
        //return s.length() - count;
    
