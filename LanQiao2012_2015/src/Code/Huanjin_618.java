package Code;

import java.text.DecimalFormat;

public class Huanjin_618 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i=1;
		double j=3;
		double sum=4;
		double bizhi=i/j;
		DecimalFormat f1=new DecimalFormat("#.000000");
		double b=Double.parseDouble(f1.format(bizhi));
		while(b!=0.618034)
		{
			sum=i+j;
			bizhi=i/j;
			b=Double.parseDouble(f1.format(bizhi));
			i=j;
			j=sum;	
			System.out.println(b);
		}
		if(b==0.618034)
		{
			System.out.println((int)i+"/"+(int)j);
		}
	}

}
