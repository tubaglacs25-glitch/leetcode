class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;//agare ise loop ke andar daal diyaa to ye baar baar max ko 0 kardega aue iski max vaali value update hini hogi
        for(int i=0;i<accounts.length;i++){
            int sum=0;//kyuki hame har customer ki row ka sum individually count karna hai
            for(int j=0;j<accounts[i].length;j++){
                       sum+=accounts[i][j];
                       if(sum>max){
                        max=sum;
                       }
            }
        }
        return max;

    }
}