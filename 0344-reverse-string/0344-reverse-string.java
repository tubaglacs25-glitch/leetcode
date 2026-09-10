class Solution {
    public void reverseString(char[] s) {
        Stack<Character> st= new Stack<>();//stack banaya-st
        for(int i=0;i<s.length;i++){
            st.push(s[i]); //s array ki saari values as it is daaldi empty stack m eto ab stack me bhi "hello " hogaya and stack me lifo hota to jo end me o hai vaha se pop karna shuru kiya vapas s mein to vo reverse hogaya
        }
        for(int l=0;l<s.length;l++){
            s[l]=st.pop();
        }
        //int left=0;
        //int right=s.length-1;
        //while(left<right){
          //  char temp=s[left];
            //s[left]=s[right];
            //s[right]=temp;
            //left++;
            //right--;

        }
        }
    
