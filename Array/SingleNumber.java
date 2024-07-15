import java.util.HashMap;
import java.util.Map;

class Solution {
    public int singleNumber(int[] nums) {
        int len=nums.length;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<len;i++)
        {
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
            else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }

        int result=0;
        for(Map.Entry m:map.entrySet()){
            System.out.println("key="+m.getKey()+" Value="+m.getValue());
            if(m.getValue().equals(1)) result=(int)m.getKey();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1};
        Solution solution = new Solution();
        System.out.println("Output: "+solution.singleNumber(arr));
    }
}
