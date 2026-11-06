class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count=0;
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            if(map.get(num)>1)return num;
        }

        return -1;
    }
}