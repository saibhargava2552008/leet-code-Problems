import java.util.HashMap;
import java.util.Arrays;
class Solution {
    public static int[] twoSum(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int currentNum=nums[i];
            int neededNum=k-currentNum;
            if (map.containsKey(neededNum)){
                return new int[]{
                    map.get(neededNum),i};
            }
            map.put(currentNum, i);
        }
        return new int[]{};
    }
    public static void main(String[] args){
        int[] nums={2,7,11,15};
        int target=9;
        int[] result=twoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));
    } 
}