class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(int i:map.keySet()){
            if(map.get(i)>nums.length/3)result.add(i);
        }

        return result;
    }
}