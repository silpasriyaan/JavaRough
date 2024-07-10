
public class MethodsDemo {

	public static void main(String[] args) {
		MethodsDemo m1=new MethodsDemo();
		m1.funA();
		m1.funB();
		m1.func();
		m1.funD();
		m1.funE();
		m1.funF();
			}
int funA()
{
	System.out.println("FunA of MethodsDemo");
	return 10;
}
long funB()
{
	System.out.println("funB of MethodsDemo");
	return 22376854;
}
float func()
{
	System.out.println("func of MethodsDemo");
	return 10.0f;
}
double funD()
{
	System.out.println("funD of MethodsDemo");
	return 10.00000000100010d;
	}
char funE()
{
	System.out.println("funE of MethodsDemo");
	return 'p';
	}
boolean funF()
{
	System.out.println("funF of MethodsDemo");
	return true;
}
}
