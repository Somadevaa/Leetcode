class Solution {
    public int differenceOfSums(int n, int m) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%m!=0)
            a.add(i);
            else
            b.add(i);

        }
        int res=sume(a)-sume(b);
        return res;



    }
    public int sume(ArrayList<Integer> num){
        int sum=0;
        for(int i: num){
            sum+=i;
        }
        return sum;
    }
}