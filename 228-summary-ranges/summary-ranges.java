class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> li=new ArrayList<>();
        if(nums.length==0) return li;
        int s=nums[0];
        int e=nums[0];
        int ns=nums[0];
        String buf="";
        
        for(int i=1;i<nums.length;i++)
        {
            buf="";
            s=ns;
            e=ns;
            
            if(Math.abs(nums[i-1]-nums[i])!=1){
                e=nums[i-1];
                ns=nums[i];
                if(s!=e)
            {
                buf=s+"->"+e;
            }
            else{
                buf=String.valueOf(e);
            }
            li.add(buf);
                
            
           
            }

            e=nums[i];
           
           
            
            

        }
         if(ns!=e)
            {
                buf=ns+"->"+e;
            }
            else{
                buf=String.valueOf(e);
            }
            li.add(buf);
        return li;
        
    }
}