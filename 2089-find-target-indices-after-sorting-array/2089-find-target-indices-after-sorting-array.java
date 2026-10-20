class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
     //Correct Code
     Arrays.sort(nums);
     List<Integer> ans=new ArrayList<>();//coz ques is asking for list (size is not fixed)
     for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            ans.add(i);
        }
     }



        //my wrong code
      //  nums.sort();
        //int ans=new int[nums.length];
        //for(int i=0;i<nums.length;i++){
          //  if(nums[i]==target){
            //    ans.append(i);
            //}
       // }
    return ans;
    }
}