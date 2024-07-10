
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test t=new Test();
t.cmpNumbers();
t.cmpNumbers1(11, 20);
t.cmpNumbers2(6, 10);
t.cmpNumbers3(100, 100);
t.cmpNumbers4(96, 97);
t.cmpNumbers5(true,true);
	}
void cmpNumbers()
{
	int x=30; int y=10;
	if (x>y)
	{
		System.out.println("x is the greater than y");
	}
	else
	{
		System.out.println("x is not greater than y");
		}
}
void cmpNumbers1(int a,int b)
{
	if (a>=b)
	{
		System.out.println(true);
	}
		else
		{
		
			System.out.println(false);
	}
		
}
void cmpNumbers2(int a, int b)
{
	if(a<=b)
	{
		System.out.println("a is less than or equal to b");
	}
	else {
		System.out.println("a is greater than b");
	}
}
void cmpNumbers3(int i, int j)
{
	if(i==j)
	{
		System.out.println("i is equal to j");
	}

else
{
	System.out.println("i is not equal to j");
}
}
void cmpNumbers4(int p, int q)
{
	if(p != q)
	{
		System.out.println("p not-equal to q is true");
	}
	else
	{
		System.out.println("p not-equal to q is false");
	}
	}
boolean cmpNumbers5(boolean x,boolean y)
{
	if(x!=y)
	{
		System.out.println("1");
	}
	else
	{
		System.out.println("0");
	}
	return true;
	}
	 
}
