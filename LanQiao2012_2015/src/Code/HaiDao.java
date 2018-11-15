package Code;

import java.text.DecimalFormat;

public class HaiDao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=20;i>0;i--)
		{
			for(int j=i-1;j>0;j--)
			{
				for(int k=j-1;k>0;k--)
				{
					for(int m=k-1;m>0;m--)
					{
						if(Math.abs((1.0/i+1.0/j+1.0/k+1.0/m)-1)<0.0000001)
						{
							System.out.println(i+" "+j+" "+k+" "+m);
						}
					}
				}
			}
		}
	}
}
		// TODO Auto-generated method stub
//		for(int i=1;i<=20;i++)
//		{
//			double peer=1;	
//			DecimalFormat f1=new DecimalFormat("#.000000");
//			double chuan=Double.parseDouble(f1.format(1/(double)i));
//			//System.out.println(chuan);
//			for(int i1=1;i-i1>2;i1++)
//			{
//				chuan+=(double)1/(i-i1);
//				//System.out.println("diyi"+chuan);
//				for(int i2=1;i-i1-i2>1;i2++)
//				{
//					chuan+=(double)1/(i-i1-i2);
//					for(int i3=1;i-i1-i2-i3>0;i3++)
//					{
//						chuan+=(double)1/(i-i1-i2-i3);
//						for(int i4=1;i-i1-i2-i3-i4>=0;i4++)
//						{
//							if(i-i1-i2-i3-i4==0&&((int)chuan==1))
//							{
//								System.out.print(i+" ");
//								//System.out.println(chuan);
//								chuan=0;
//								System.out.println();
//								break;
//							}
//							else{
//								chuan=0;
//							}
//					}
//				}
//			}
//		}
//	}
//  }
//}
