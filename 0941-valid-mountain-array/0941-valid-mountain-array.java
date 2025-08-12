class Solution {
    public boolean validMountainArray(int[] arr) {
        int l=0;
        int r=arr.length-1;
        while(l<r&&arr[l]<arr[l+1])
            l++;
        while(r-1>=0&&arr[r]<arr[r-1])
            r--;
        return l>0&&r<arr.length-1&& l==r;
        
                
            }      }
    
