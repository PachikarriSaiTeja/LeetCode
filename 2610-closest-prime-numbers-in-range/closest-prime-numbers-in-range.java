class Solution {
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> al=new ArrayList<>();
        int d=Integer.MAX_VALUE;
        int cur=Integer.MAX_VALUE;
        int a=-1;
        int b=-1;
        int[] arr=new int[right+1];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<right+1;i++)
        {if(arr[i]==0)
        {
            
            for(long j=(long)i*i;j<right+1;j+=i)
            {
                arr[(int)j]=1;
                
            }
        }
        }
        for(int i=left;i<right+1;i++)
        {
            if(arr[i]==0){
                al.add(i);
            }
        }
        for(int i=1;i<al.size();i++)
        {
            d=al.get(i)-al.get(i-1);
            if(d<cur)
            {
                cur=d;
                a=al.get(i-1);
                b=al.get(i);
            }

        }
        int [] out=new int[2];
        out[0]=a;
        out[1]=b;

        return out;









        
    }
}