class Solution {
    public char findTheDifference(String s, String t) {
        int tsum=0;
        int ssum=0;
        for(int i=0;i<t.length();i++){
            tsum=tsum+t.charAt(i);
        }
        for(int j=0;j<s.length();j++){
            ssum=ssum+s.charAt(j);
        }
        int diff=tsum-ssum;
        return (char)diff;
    }
}