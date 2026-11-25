class Solution {
    public int majorityElement(int[] nums) {
        int maxfreq =0;
        int maxele=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key)>maxfreq){
                maxfreq = map.get(key);
                maxele = key;
            }
        }
        return maxele;
    }
}