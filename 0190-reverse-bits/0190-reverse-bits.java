class Solution {
    public int reverseBits(int n) {
     String a=String.format("%32s",Integer.toBinaryString(n)).replace(' ', '0');
       StringBuilder bd=new StringBuilder(a);
      
       
       bd.reverse();
       int b= Integer.parseInt(bd.toString(),2);
       return b;




       

}
}