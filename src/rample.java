
public class rample {
	int x=4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
rample r1=new rample();
Sample s1=new Sample();
//r1.fun2(s1);
	//s1.fun2(r1);	
//r1.fun2();
//r1.fun2(null);
System.out.println(r1.x);
r1.fun2(new Sample());
System.out.println(r1.x);
//System.out.println(s1.i);
	}
	void fun2(Sample s1)
	{
	System.out.println("fun1 of rample is invoked");
  x=x+2;
  //s1.i=i+5;
		}
}