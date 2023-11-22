package exeption;

public class Mathematique  {
	double n;
	double x;
	static double f(double n,double x)throws ParametreNullException ,  NegatifException
	{if(n==0)
		throw new ParametreNullException("nullll");
	if(n<0)

        throw new  NegatifException("pas des nombres negatives");
		
		
		return Math.sqrt(x)/n;

		
	
	
	
	}
}


