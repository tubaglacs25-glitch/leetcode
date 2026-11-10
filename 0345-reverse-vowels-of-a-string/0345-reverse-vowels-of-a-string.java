class Solution {
    public String reverseVowels(String s) {
        char ch[]=s.toCharArray();
        int start=0;
        char temp;
        String vow="aeiouAEIOU";
        int end=ch.length-1;
        while(start<end){
            if(vow.indexOf(ch[start])==-1)
           {
            start++;
           }
               else if(vow.indexOf(ch[end])==-1)
               //OR !vow.contains(String.valueOf(ch[end]))
           {
              end--;
           }
           else{
                  temp=ch[start];
                  ch[start]=ch[end];
                  ch[end]=temp;
                  start++;
                  end--;
           }
        }
        return String.valueOf(ch);
    }
}