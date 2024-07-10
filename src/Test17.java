
public class Test17 {
static int rbg=1;
Test17()
{
	System.out.println("Cons of test invoking");
	rbg=rbg+1;
}
	public static void main(String[] args) {
		
		System.out.println(rbg);
		new Test17();
		new Test17();
		new Test17();
		System.out.println(rbg);
	}

}
