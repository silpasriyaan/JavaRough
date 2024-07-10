
public class ArmStrongNumber {
	int x;
	int funA(int num,int a)
	{
		if(num!=0)
		{
			x=num%10;
			a=a+(x*x*x);
			num/=10;
			return funA(num,a);
			}
		return a;
	}

	public static void main(String[] args) {
		ArmStrongNumber A= new ArmStrongNumber();
		int arm;
		System.out.println("ArmStrong numbers between 1 to 500");

		for(int i=1;i<500;i++)
		{
			arm=A.funA(i, 0);
			if(arm==i)
			{                           
				System.out.println(i);
			}
		}

	}

}
