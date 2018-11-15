package Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	String line1=sc.nextLine();
    	String line2=sc.nextLine();
    	String []l1=line1.split(" ");
    	String []l2=line2.split(" ");
    	int times=Integer.parseInt(l1[0]);
    	int space=Integer.parseInt(l1[1]);
    	int sp[]=new int[space];
    	int dp[]=new int [times+1];
    	dp[0]=0;
    	for(int i=0;i<times;i++)
    	{
    		
    		int n=Integer.parseInt(l2[i]);
    		if(n>space||n==0)
    		{
    			System.out.println("SKIP:"+(i+1)+" "+n);
    		}
    		if(n>space-dp[i])
    		{
    			for(int j=dp[i];j<space;j++)
    				sp[j]=0;
    			int f=n;
    			while(sp[f]==sp[n-1]&&f<space)
    				sp[f++]=0;
    			for(int k=0;k<n;k++)
    			{
    				sp[k]=i+1;
    			}
    			dp[i+1]=n;
    		}
    		else{
    			int ch=sp[dp[i]];
    			int k=dp[i];
    		
    			while(n>0||(k<space&&sp[k]==ch&&sp[k]!=0))
    			{
    				if(i==31)
        			{
        				System.out.println(k+"  "+sp[k]+" "+ch+" "+sp[k]+" "+n);
        			}
    				if(n<=0)
    					sp[k]=0;
    				else
    					
    				{
    					ch=sp[k];
        				sp[k]=i+1;	
        				dp[i+1]=k+1;
    				}
    				n--;
    				k++;
    				if(i==31)
    				System.out.println(k+"  "+sp[k]+" dd"+ch+" "+sp[k]+" dd"+n);
    			}
    		}
    		
    		System.out.println(Arrays.toString(sp));
    	}
    	int pre=0;
    	Map<Integer,Integer> map=new HashMap<Integer,Integer>();
    	for(int i=0;i<space;i++)
    	{
    		if(sp[i]!=pre)
    			map.put(sp[i], i);
    		pre=sp[i];
    	}

List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>()
		{

	public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2)
		{ return o1.getKey()-o2.getKey();}}); 

    for(Entry<Integer, Integer> t1:list)
    {
    	System.out.println(t1.getKey()+" "+t1.getValue());
    }
	}

}
