package Code;

import java.util.Arrays;

public class D92 {

	/**
	 * @param args
	 */
	public boolean stoneGame(int[] piles) {
        int alex=0;
        int li=0;
        int i=0;
        int j=piles.length-1;
        while(i<j)
        {
            if(i+1==j)
            {
                 alex+=Math.max(piles[i],piles[j]);
                 li+=Math.min(piles[i],piles[j]);
                i++;
                j--;
            }
            else
            {

               
                int l=piles[i]+Math.max(Math.min(piles[i+1], piles[j]), piles[j-1]);
                int r=piles[j]+Math.max(Math.min(piles[i], piles[j-1]), piles[i+1]);
                if(l>r)
                {
                	alex+=l;
                	li+=Math.max(piles[i+1], piles[j])+Math.min(Math.min(piles[i+1], piles[j]), piles[j-1]);
                }
                else
                {
                	alex+=r;
                	li+=Math.max(piles[i], piles[j-1])+Math.min(Math.min(piles[i], piles[j-1]), piles[i+1]);
                }
                 i+=2;
                 j-=2;
            }
            System.out.println(alex+"  "+li+"  "+i+"  "+j);
        }
        return (alex>li);
    }
	public int minCut2(String s) {
        int length=s.length();
	   int [][]dp=new int[length][length];
	        for(int i=0;i<length;i++)
	        {
	            for(int j=0;j<=i;j++)
	            {
	                if(j==i||(i-j==1&&s.charAt(j)==s.charAt(i)))
	                    dp[i][j]=1;
	                else
	                {
	                    if(s.charAt(j)==s.charAt(i)) 
	                        dp[i][j]=dp[i-1][j+1];
	                }
	            }
	        }
	       for(int i=0;i<length;i++)
	       {
	    	   for(int j=0;j<length;j++)
	    	   {
	    		   System.out.print(dp[i][j]+"   ");
	    	   }
	    	   System.out.println("---------------");
	       }
      int sum=Integer.MAX_VALUE;
      System.out.println(sum);
       int t=0;
       while(t<length-1)
       {
    	   System.out.println(t);
           int i=length-1;
           while(dp[i][t]==0&&dp[t][i]==0)
               i--;
           if(length-1==i)
               return sum;          
           sum++;
           t=i+1;   
       }
       return sum;
   }
    public int minCut(String s) {
        int length=s.length();
	   int [][]dp=new int[length][length];
	        for(int i=0;i<length;i++)
	        {
	            for(int j=0;j<=i;j++)
	            {
	                if(j==i||(i-j==1&&s.charAt(j)==s.charAt(i)))
	                    dp[i][j]=1;
	                else
	                {
	                    if(s.charAt(j)==s.charAt(i)) 
	                        dp[i][j]=dp[i-1][j+1];
	                }
	            }
	        }  
       int min=Integer.MAX_VALUE;
       for(int i=0;i<length;i++)
       {
          
           if(dp[i][0]==1)
                min=Math.min(min,getTime(dp,i+1,length));
           
       }
       return min;
   }
   
 public int getTime(int [][]dp,int start,int length)
 {
	 
     int min=Integer.MAX_VALUE;
     if(start>length-1)
         return 0;
     for(int i=start;i<length;i++)
     {
    	 System.out.println(start+"  "+i+"  "+dp[i][start]);
         if(dp[i][start]==1)
             min=Math.min(min,1+getTime(dp,i+1,length));
     }
      return min;   
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		String s="aab";
		D92 a=new D92();
//		a.minCut(s);
		//System.out.println(Integer.MAX_VALUE);
		String s="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";	 
		        String pre=s.substring(0,s.length()/2);
		        String post=s.substring(s.length()/2+(s.length()%2==0?0:1));
		        StringBuffer po=new StringBuffer(post);
		        post=po.reverse().toString();
		        System.out.println(s.length()+"  "+pre.length()+"   "+post.length());
		        System.out.println(pre);
		        System.out.println(post);
		        System.out.println( pre.equals(post));
	}
		   

}
