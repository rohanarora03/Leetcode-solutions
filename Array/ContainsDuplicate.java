class Solution {
    public boolean containsDuplicate(int[] nums) {

        int len = nums.length;
        // System.out.println(len);

        Map <Integer, Integer> map = new HashMap<>();
        boolean flag=false;
        int count=1;
        for(int i=0; i<len; i++)
        {
            map.put(nums[i], count);
        }
        // System.out.println("Size of map is:- "+ map.size());
        if(map.size()!=len) flag=true;
        return flag;
    }
}
