
public class ArrayAdd {

	public static void main(String[] args) {
		int[] a={1,2,3,4};
		int[] b={2,1,2,4};
		int a1=a.length;
		int b1=b.length;
		int c1=a1+b1;
		System.out.println(c1);
		int[] c= new int[c1];
		for (int i=0;i<a1;i=i+1)
		{
			c[i]=a[i];
			System.out.println(c[i]);
		}
		for (int i=0;i<b1;i=i+1)
		{
			c[a1+i]=b[i];
		}
	}

}
