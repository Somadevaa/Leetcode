class Solution {
    public String[] sortPeople(String[] n, int[] h) {
        for (int j = 0; j < h.length - 1; j++) {
            int s=j;
            for (int i = j+1; i < h.length; i++) {
                if (h[i] > h[s]) {
                    s=i;}}
                    // swap heights
                    int tempH = h[j];
                    h[j] = h[s];
                    h[s] = tempH;

                    
                    String tempN = n[j];
                    n[j] = n[s];
                    n[s] = tempN; 
                
            
        }
        return n;
    }
}

