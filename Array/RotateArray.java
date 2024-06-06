class Solution {
    public void rotate(int[] nums, int k) {

        int len = nums.length;
        // System.out.println(len);
        k=k % len;

        int[] arr = new int[len];

        int counter=0;
        for(int i=len-k; i<len; i++){
            arr[counter]=nums[i];
            counter+=1;
        }

        // System.out.println(counter);
        for(int j=0; j<len-k; j++){
            arr[counter]=nums[j];
            counter+=1;
        }
        // System.out.println(counter);

        // nums=arr;
        for(int a=0; a<len; a++){
            nums[a]=arr[a];
        }
    }
}