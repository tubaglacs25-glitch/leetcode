class Solution {
    public int maxArea(int[] height) {
        int size=height.length;
        int maxarea=0;
        int i=0;
        int j=size-1;
        while(i<j){
            int length=Math.min(height[i],height[j]);
            int breadth=j-i;
            int area=length*breadth;
            if(area>maxarea){
                maxarea=area;
            }
            if(height[i]>height[j]){
                j--;
            }
            else{
            i++;}
        }
            
        return maxarea;
    }
}