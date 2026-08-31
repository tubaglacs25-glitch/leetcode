class Solution {
    public char findTheDifference(String s, String t) {
        int tsum=0;
        int ssum=0;
        for(int i=0;i<t.length();i++){
            tsum=tsum+t.charAt(i);//t ke saare characters ki assci values ko sum karega
        }
        for(int j=0;j<s.length();j++){
            ssum=ssum+s.charAt(j);//s ke saare characters ko sum karega
        }
        int diff=tsum-ssum;
        return (char)diff;//do numbers ko dubtract karke jo value ayegi use char me convert karega that will be the answer
    }
}