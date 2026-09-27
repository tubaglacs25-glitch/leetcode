class Solution {
    public void rotate(int[] nums, int k) {

        int n=nums.length;
        k=k%n;
        
        //pure array
        int left=0;
        int right=n-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;

        }

        //0 to k-1 array
         left=0;
         right=k-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;

        }
      
      //k to n-1;

      //pure array
         left=k;
        right=n-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;

        }

    }
}