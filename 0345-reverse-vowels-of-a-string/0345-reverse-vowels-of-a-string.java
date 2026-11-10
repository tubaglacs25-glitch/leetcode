class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        int left=0;
        int right=ch.length-1;
        char temp;
        String vow="AEIOUaeiou";
        while(left<right){
            if(vow.indexOf(ch[left])==-1){
                  left++;
            }
            else if(vow.indexOf(ch[right])==-1){
                  right--;
            }
            else{
                temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
        }
        return new String(ch);
    }
}