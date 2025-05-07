class Solution {
    public int count(int n)
    {
        int cnt=0;
        while(n>0)
        {
            cnt+=1;
            n&=(n-1);

        }
        return cnt;
    }
    public int[] countBits(int n) {

        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<=n;i++)
        {
            li.add(count(i));
        }
        int[] arr= new int[li.size()];
        for(int i=0;i<li.size();i++)
        {
            arr[i]=li.get(i);
        }
        return arr;
    }

}