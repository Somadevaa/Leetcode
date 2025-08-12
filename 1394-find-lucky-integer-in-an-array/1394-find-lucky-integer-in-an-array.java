class Solution {
    public int findLucky(int[] arr) {
        Map <Integer,Integer> a =new HashMap<>();
        for(int i: arr)
        a.put(i,a.getOrDefault(i,0)+1);
        int lucky =-1;
        for(Map.Entry<Integer,Integer> entry : a.entrySet()){
            int num=entry.getKey();
            int value =entry.getValue();
            if(num==value&&num>lucky)
            lucky =num;
        }
        return lucky;
    }
}