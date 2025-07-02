class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int index=0;
        List<int[]> result = new ArrayList<>();
        while(index<intervals.length){
            int newstart= intervals[index][0];
            int newend=intervals[index][1];
            while(index<intervals.length-1&& newend>=intervals[index+1][0]){
                newend=Math.max(newend,intervals[index+1][1] );
                index+=1;
            }
            int nend= newend;
            result.add(new int[]{newstart,nend});
            index+=1;
        }
        index =0;
        int[][] res = new int[result.size()][0];
        for(int []arr:result){
            res[index++]=arr;
        }

        return res;
    }
}