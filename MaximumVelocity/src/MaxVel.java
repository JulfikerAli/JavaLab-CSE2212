import java.util.Scanner;

public class MaxVel {

	@SuppressWarnings("unused")
	private Scanner sc;

	public double UnitTest(double m)
	{
		sc = new Scanner(System.in);
		int v[]= {1,10,20,40};
		int r=3;
		double t=60;
		double Force,result=0;
		
		
			
		for(int i=0;i<4;i++)
		{
			Force=(m * v[i]*v[i])/r;
			if(Force<=t )
			{
				result=Math.max(result, Force);
			}
		}
		if(result==0) System.out.println("For This Mass The Rope Is Going To Breakdown:");
		else System.out.println("Maximum Velocity "+result);
		return result;
		
	}

}